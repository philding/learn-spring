package org.example.test;

import org.example.config.SpringConfig;
import org.example.service.UserInfoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserInfoService userInfoService = applicationContext.getBean("userInfoServiceImpl", UserInfoService.class);
        userInfoService.getUserData();
        System.out.println(userInfoService);


    }
}