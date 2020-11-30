package com.example.demo.services;

import com.example.demo.domains.UserDTO;

import org.springframework.stereotype.Component;

@Component
public interface UserService {
    public void join(UserDTO user);
}
