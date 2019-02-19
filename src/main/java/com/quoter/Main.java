package com.quoter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        classPathXmlApplicationContext.getBean(TerminatorQuoter.class).sayQuote();
    }
}
