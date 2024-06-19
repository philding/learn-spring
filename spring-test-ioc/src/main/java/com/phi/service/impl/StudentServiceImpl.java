package com.phi.service.impl;

import com.phi.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class StudentServiceImpl<T> implements UserService {

    private Class<T> service;

    @Override
    public void show() {
        System.out.println("StudentServiceImpl Show:");

        try {
            System.out.println(service.newInstance());
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public StudentServiceImpl() {
        System.out.println("初始化UserServiceImpl");
    }
}
