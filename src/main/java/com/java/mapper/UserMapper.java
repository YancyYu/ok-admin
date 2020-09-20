package com.java.mapper;

import com.java.model.UserModel;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    /**
     * 登录验证
     */
    @Select("select * from user where name=#{name}")
    UserModel login(String name);

}
