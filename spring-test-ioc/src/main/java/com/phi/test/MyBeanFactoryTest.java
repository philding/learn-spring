package com.phi.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Qf.Ding
 * @CreateTime: 2024-06-19
 * @Description:
 * @Version: 1.0
 */
public class MyBeanFactoryTest {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        Object userDao = applicationContext.getBean("userDao1");

        System.out.println (userDao) ;
    }
}
