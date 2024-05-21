package com.artemnizhnyk.sushishopbackend.service;

import com.artemnizhnyk.sushishopbackend.web.dto.LoginRequest;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;

public interface UserService {

    Authentication authenticate(final LoginRequest loginRequest) throws BadCredentialsException;
}
