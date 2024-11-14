package com.api.learning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.learning.mapper.UserMapper;
import com.api.learning.model.view.UserView;
import com.api.learning.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private final UserService userService;
    @Autowired
    private UserMapper userMapper;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    @GetMapping
    public List<UserView> getAllUsers() {

        var users = userService.getAllUsers();
        return users.stream()
                .map(userMapper::toView) // Sử dụng mapper để chuyển đổi từng UserEntity sang UserView
                .collect(Collectors.toList());
    }
}
