package com.githup.mybatis.dao;

import com.githup.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询所有用户
    List<User> findUser();

    User findUserByUserName(String name);

    User findUserByUserNameAdUserRole(User user);

    User findUserByMap(Map<String, Object> map);
    //注解param 就可发将参数注入到userMapper.xml
    User findUserByUserNameAdUserRole1(@Param("userName") String name,@Param("userRole") int role);
}
