package com.hwua.project.service;

import com.hwua.project.entity.User;

public interface UserService {
    public String selectUserByUsername(String user_username,String user_password);
    public int insertUser(User user);
}
