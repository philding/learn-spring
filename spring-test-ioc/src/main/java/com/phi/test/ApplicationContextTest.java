package com.phi.test;

import com.phi.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author: Qf.Ding
 * @CreateTime: 2024-06-18
 * @Description:
 * @Version: 1.0
 */
public class ApplicationContextTest {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");


        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService);

    }
}
