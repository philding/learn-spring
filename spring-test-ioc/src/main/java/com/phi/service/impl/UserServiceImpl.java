package com.phi.service.impl;

import com.phi.dao.UserDao;
import com.phi.service.UserService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class UserServiceImpl implements UserService {

    //Set方法注入
    @Setter
    private UserDao userDao;

    private String name;

    public void show() {
        System.out.println("UserServiceImpl Show:");
        System.out.println(userDao);
    }

    public UserServiceImpl() {
        System.out.println("初始化UserServiceImpl");
    }
}
