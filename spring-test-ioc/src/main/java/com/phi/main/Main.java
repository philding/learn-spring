package com.phi.main;

import com.phi.dao.UserDao;
import com.phi.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Main {

    public static void main(String[] args) {
        //创建工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory ();

        //创建一个读取器(xml文件)
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader (beanFactory);

        //读取配置文件给工厂
        reader.loadBeanDefinitions("beans.xml");

        //根据id获取实例对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        System.out.println(userService);

        UserDao userDao = (UserDao) beanFactory.getBean("userDao");
        System.out.println(userDao);
    }
}