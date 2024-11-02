package com.fashion_order_server.controller;

import com.fashion_order_server.model.User;
import com.fashion_order_server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
//@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/exist/{userId}")
    public boolean isExistId(@PathVariable String userId) {
        return userService.isExistId(userId);
    }

    @GetMapping("/{userNo}")
    public User getUserById(@PathVariable Integer userNo) {
        return userService.getUserById(userNo);
    }

    @PostMapping("/")
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }
}