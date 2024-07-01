package org.example.proxy;


import org.example.advice.LogAdvice;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class MyInvocationHandler implements InvocationHandler {


    private final LogAdvice logAdvice;

    private final Object bean;

    public MyInvocationHandler(Object bean,LogAdvice logAdvice) {
        this.bean = bean;
        this.logAdvice = logAdvice;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        //执行增强对象的方法
        logAdvice.beforePrintInputLog();

        //执行目标对象的方法
        Object result = method.invoke(bean, args);

        //执行增强对象的方法
        logAdvice.afterPrintResultLog();
        return result;
    }

}
