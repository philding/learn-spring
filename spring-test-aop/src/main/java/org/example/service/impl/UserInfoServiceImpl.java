package org.example.service.impl;

import lombok.AllArgsConstructor;
import org.example.dao.UserDao;
import org.example.service.UserInfoService;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class UserInfoServiceImpl implements UserInfoService {


    private final UserDao userDao;

    @Override
    public void getUserData() {

        System.out.println("获取User信息");

    }

    @Override
    public void addUserInfo() {
        System.out.println("添加User信息");
    }
}
