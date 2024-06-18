package com.phi.test;

import com.phi.dao.UserDao;
import com.phi.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * 1. 概念定义
 * BeanDefinition：Bean元数据描述，Bean在Spring IOC容器中的抽象，是Spring的一个核心概念
 * DefaultListableBeanFactory ：Spring IOC容器的实现，可以作为一个独立使用的容器， Spring IOC容器的始祖
 * XmlBeanFactory：继承自DefaultListableBeanFactory，与其不同点在于XmlBeanFactory中使用了自定义的XML读取器XmlBeanDefinitionReader，实现了个性化的BeanDefinitionReader读取
 * ApplicationContext: 高级容器定义接口，基于BeanFactory添加了扩展功能，如ResourceLoader、MessageSource、ApplicationEventPublisher等
 */
public class BeanFactoryTest {
    public static void main(String[] args) {

        //创建工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory ();

        XmlBeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans.xml"));

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
