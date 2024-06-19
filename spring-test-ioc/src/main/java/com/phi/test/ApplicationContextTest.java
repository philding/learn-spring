package com.phi.test;

import com.phi.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Author: Qf.Ding
 * @CreateTime: 2024-06-18
 * @Description:
 * @Version: 1.0
 */
@Slf4j
public class ApplicationContextTest {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");


        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService);

    }
}
