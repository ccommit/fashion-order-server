package com.fashion_order_server.service;

import com.fashion_order_server.mapper.UserMapper;
import com.fashion_order_server.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public boolean isExistId(String userId) {
        return userMapper.existsByUserId(userId);
    }

    public void createUser(User user) {
        userMapper.insertUser(user);
    }

    public User getUserById(Integer userNo) {
        return userMapper.selectUserById(userNo);
    }
}