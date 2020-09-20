package cn.mi46.service.impl;

import cn.mi46.mapper.UserMapper;
import cn.mi46.model.UserModel;
import cn.mi46.service.UserService;
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
