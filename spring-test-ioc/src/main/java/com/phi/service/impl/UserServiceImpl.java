package com.phi.service.impl;

import com.phi.dao.UserDao;
import com.phi.service.UserService;






public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //Set方法注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void show() {
        System.out.println("UserServiceImpl Show:");
        System.out.println(userDao);
    }

    public UserServiceImpl() {
        System.out.println("初始化UserServiceImpl");
    }
}
