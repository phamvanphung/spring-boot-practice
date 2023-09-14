package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.enums.Role;
import com.example.demo.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateInitUser {

    private final UserRepository userRepository;

    @PostConstruct
    public void initUser(){
        User user1 = new User()
            .setName("user1")
            .setPassword("password123")
            .setEmail("email1@email.com")
            .setUsername("123456789")
            .setRole(Role.USER);
        userRepository.save(user1);

        User user2 = new User()
            .setName("user2")
            .setPassword("password321")
            .setEmail("email2@email.com")
            .setUsername("987654321")
            .setRole(Role.ADMIN);
        userRepository.save(user2);
    }
}
