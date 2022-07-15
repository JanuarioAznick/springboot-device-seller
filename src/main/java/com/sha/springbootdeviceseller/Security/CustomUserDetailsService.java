package com.sha.springbootdeviceseller.Security;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sha.springbootdeviceseller.Modal.User;
import com.sha.springbootdeviceseller.Service.UserService;
import com.sha.springbootdeviceseller.Utils.SecurityUtils;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		
		User user = userService.findUserByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException(username));
		
		Set<GrantedAuthority> authorities = Set.of(SecurityUtils.convertToAuthority(user.getRole().name()));
		return UserPrincipal.builder()
				.user(user)
				.id(user.getId())
				.username(username)
				.password(user.getPassword())
				.authorities(authorities)
				.build();
	}

}
