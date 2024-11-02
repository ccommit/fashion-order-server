package com.fashion_order_server.mapper;

import com.fashion_order_server.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT COUNT(*) > 0 FROM user WHERE id = #{userId}")
    boolean existsByUserId(String userId);

    void insertUser(User user);

    User selectUserById(Integer userNo);
}
