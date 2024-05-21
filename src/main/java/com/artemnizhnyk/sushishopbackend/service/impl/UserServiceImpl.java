package com.artemnizhnyk.sushishopbackend.service.impl;

import com.artemnizhnyk.sushishopbackend.repository.UserRepository;
import com.artemnizhnyk.sushishopbackend.service.UserService;
import com.artemnizhnyk.sushishopbackend.web.dto.LoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserDetailsService userDetailsService;
    private final PasswordEncoder passwordEncoder;

    public Authentication authenticate(final LoginRequest loginRequest) throws BadCredentialsException {
        UserDetails userDetails = userDetailsService.loadUserByUsername(loginRequest.getEmail());
        if (userDetails != null && passwordEncoder.matches(loginRequest.getPassword(), userDetails.getPassword())) {
            Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            return authentication;
        }
        throw new BadCredentialsException("Invalid credentials");
    }
}
