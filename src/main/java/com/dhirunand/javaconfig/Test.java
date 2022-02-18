package com.dhirunand.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
//        ApplicationContext context = new ClassPathXmlApplicationContext("configjava.xml");
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configjava.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);

//        Student student = context.getBean("firstStudent", Student.class);
        Student student = context.getBean("getStudent", Student.class);
        System.out.println(student);

//        context.close();   when context is reference of ClassPathXmlApplicationContext()
    }
}
