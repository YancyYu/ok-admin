package cn.mi46.mapper;

import cn.mi46.model.UserModel;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    /**
     * 登录验证
     */
    @Select("select * from user where name=#{name}")
    UserModel login(String name);

}
