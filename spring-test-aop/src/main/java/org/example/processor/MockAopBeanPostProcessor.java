package org.example.processor;

import org.example.advice.LogAdvice;
import org.example.proxy.MyInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@Component
public class MockAopBeanPostProcessor implements BeanPostProcessor {

    @Autowired
    private LogAdvice logAdvice;

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //目的的：UserServiceImp1中的方法进行增强，增强方法存在与LogAdvice 中
        //问题1：筛选service。imp1包下的所有的类的所有方法都可以进行增强，解决方案if-else
        // 问题2：MyAdvice怎么获取到？解决方案：MSpring容器中获得MyAdvice
        if(bean.getClass().getPackage().getName().equals("org.example.service.impl")){
            //生成当前Bean的proxy对象


            return Proxy.newProxyInstance(
                    bean.getClass().getClassLoader(),
                    bean.getClass().getInterfaces(),
                    new MyInvocationHandler(bean,logAdvice)
            );
        }


        return bean;
    }


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }
}
