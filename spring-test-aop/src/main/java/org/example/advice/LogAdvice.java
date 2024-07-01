package org.example.advice;

import org.springframework.stereotype.Component;

@Component
public class LogAdvice {

    public void beforePrintInputLog() {
        System.out.println("入参打印");


    }

    public void afterPrintResultLog() {
        System.out.println("结果打印");

    }


}
