package com.dhirunand.referenceinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configrefinjection.xml");

        StudentPojo studentPojo = (StudentPojo) context.getBean("student1");
        System.out.println(studentPojo);
        System.out.println(studentPojo.getAddressOfStudent());

    }
}
