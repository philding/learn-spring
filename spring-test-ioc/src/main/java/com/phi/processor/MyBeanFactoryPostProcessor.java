package com.phi.processor;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("beanDefinition填充完毕后调用该方法");
        //修改某个beanDefinition
//        BeanDefinition userService = configurableListableBeanFactory.getBeanDefinition("userService");
//        userService.setBeanClassName("com.phi.dao.dqf");

    }
}
