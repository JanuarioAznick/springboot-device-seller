package com.sha.springbootdeviceseller.Security.jwt;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;

import com.sha.springbootdeviceseller.Security.UserPrincipal;

public interface JwtProvider {

	String generateToken(UserPrincipal auth);

	Authentication getAuthentication(HttpServletRequest request);

	boolean isTokenValid(HttpServletRequest request);

	
}
