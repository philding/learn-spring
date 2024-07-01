package org.example.service.impl;

import lombok.AllArgsConstructor;
import org.example.dao.UserDao;
import org.example.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserInfoServiceImpl implements UserInfoService {


    @Autowired
    private  UserDao userDao;

    @Override
    public void getUserData() {


        System.out.println("获取User信息");
        userDao.findUserInfo();

    }

    @Override
    public void addUserInfo() {
        System.out.println("添加User信息");
    }
}
