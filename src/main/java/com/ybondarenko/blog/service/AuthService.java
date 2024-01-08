package com.ybondarenko.blog.service;

import com.ybondarenko.blog.dto.RegisterRequest;
import com.ybondarenko.blog.entity.User;
import com.ybondarenko.blog.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;

    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUserName(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());
        user.setEmail(registerRequest.getEmail());
        userRepository.save(user);
    }
}
