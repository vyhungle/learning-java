package com.api.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.learning.model.entity.UserEntity;
import com.api.learning.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        // Logic xử lý
        var users = userRepository.findAll();
        return users;
    }
}