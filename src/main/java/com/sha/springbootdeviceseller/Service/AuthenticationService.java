package com.sha.springbootdeviceseller.Service;

import com.sha.springbootdeviceseller.Modal.User;

public interface AuthenticationService {

	User signInAndReturnJWT(User signInRequest);

}
