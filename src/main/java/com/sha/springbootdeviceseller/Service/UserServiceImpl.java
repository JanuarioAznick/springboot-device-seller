package com.sha.springbootdeviceseller.Service;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sha.springbootdeviceseller.Modal.Role;
import com.sha.springbootdeviceseller.Modal.User;
import com.sha.springbootdeviceseller.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public User saveUser(User user) {
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setRole(Role.USER);
		user.setCreateTime(LocalDateTime.now());
		
		return userRepository.save(user);
	}

	@Override
	public Optional<User> findUserByUsername(String Username) {
		
		return userRepository.findByUsername(Username);
	}
	
	@Override
	@Transactional // this is required when executing an update/delete
	public void changeRole(Role newRole, String username) {
		userRepository.updateUserRole(username, newRole);
	}
}
