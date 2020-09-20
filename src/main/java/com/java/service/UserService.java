package com.java.service;

import com.java.model.UserModel;

public interface UserService {
    /**
     * 登录
     */
    UserModel login(String name);
}
