package com.dhirunand.collectionsexample;

import com.dhirunand.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configcollection.xml");

        StudentBeanOrPojo student1 = (StudentBeanOrPojo) context.getBean("student1");

        System.out.println(student1.getName());
        System.out.println(student1.getPhones());
        System.out.println(student1.getAddresses());
        System.out.println(student1.getCourses());


    }
}