package cn.mi46.service;

import cn.mi46.model.UserModel;

public interface UserService {
    /**
     * 登录
     */
    UserModel login(String name);
}
