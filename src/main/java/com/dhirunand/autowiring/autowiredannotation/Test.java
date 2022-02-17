package com.dhirunand.autowiring.autowiredannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configautowiringautowired.xml");

        Employee employee = context.getBean("employee", Employee.class);  // ya to type caste kro ya getBean() ke constructor me class pass kr do

        System.out.println(employee);
    }
}
