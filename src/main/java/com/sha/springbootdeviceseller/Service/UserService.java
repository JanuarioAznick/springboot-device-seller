package com.sha.springbootdeviceseller.Service;

import java.util.Optional;

import com.sha.springbootdeviceseller.Modal.Role;
import com.sha.springbootdeviceseller.Modal.User;

public interface UserService {

	User saveUser(User user);

	Optional<User> findUserByUsername(String Username);

	void changeRole(Role newRole, String username);

}
