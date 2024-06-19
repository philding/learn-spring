package com.phi.test;

import com.phi.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Author: Qf.Ding
 * @CreateTime: 2024-06-18
 * @Description:
 * @Version: 1.0
 */

public class ApplicationContextTest {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.show();

//        Object userDao = applicationContext.getBean("userDao");
        UserService studentService = (UserService) applicationContext.getBean("studentService");
        studentService.show();
    }
}
