package com.artemnizhnyk.sushishopbackend.web.controller;

import com.artemnizhnyk.sushishopbackend.service.UserService;
import com.artemnizhnyk.sushishopbackend.web.dto.LoginRequest;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:1111")
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
@RestController
public class AuthController {

    private final UserService userService;

//    @GetMapping("/login")
//    public ResponseEntity<?> login(@PathParam("email") String email, @PathParam("password") String password) {
//
//        LoginRequest loginRequest = new LoginRequest();
//        loginRequest.setEmail(email);
//        loginRequest.setPassword(password);
//        Authentication authentication = userService.authenticate(loginRequest);
//
//        return (authentication != null && authentication.isAuthenticated())
//                ? ResponseEntity.ok("Login successful")
//                : ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//
//    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {

        Authentication authentication = userService.authenticate(loginRequest);

        return (authentication != null && authentication.isAuthenticated())
                ? ResponseEntity.ok("Login successful")
                : ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");

    }
}
