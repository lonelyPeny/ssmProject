package com.hwua.project.dao;

import com.hwua.project.entity.User;

public interface UserDao {
//    查询  查
    public User selectUserByUsername(String user_username);
//    注册  增
    public int insertUser(User user);
//    注销  删
//    public int deleteUser(User user);
//    修改数据  改
//    public int updateUser(User user);
}
