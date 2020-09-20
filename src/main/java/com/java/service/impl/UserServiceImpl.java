package com.java.service.impl;

import com.java.mapper.UserMapper;
import com.java.model.UserModel;
import com.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserModel login(String name) {
        return userMapper.login(name);
    }
}
