package com.dhirunand.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  Autowiring
 *  1. xml          : no, byName, byType, constructor, autodetect(depreciated)
 *  2. Annotations  : @Autowired
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configautowiring.xml");

        Employee employee = context.getBean("employee", Employee.class);  // ya to type caste kroo ya getBean() ke constructor me class pass kr do

        System.out.println(employee);
    }
}
