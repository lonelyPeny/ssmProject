package com.hwua.project.serviceImpl;

import com.hwua.project.dao.UserDao;
import com.hwua.project.entity.User;
import com.hwua.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public String selectUserByUsername(String user_username, String user_password) {
        User user=userDao.selectUserByUsername(user_username);
        if (user==null){
            return "用户名不存在";
        }else if (user.getUser_password().equals(user_password)){
            return "登录成功";
        }else {
            return "密码错误";
        }
    }

    @Override
    @Transactional
    public int insertUser(User user) {
        int number = userDao.insertUser(user);
        return number;
    }
}
