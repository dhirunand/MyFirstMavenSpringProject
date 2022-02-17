package com.dhirunand.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

/**
 *      Configuration Technique of lifecycle methods
 *       1. Xml              : see configlyfecycycle.xml & Samosa.java
 *       2. Spring Interface : see Pepsi.java
 *       3. Annotation       : see Example.java
 */


//        ApplicationContext context = new ClassPathXmlApplicationContext("configlyfecycle.xml");
//        Samosa samosa = (Samosa) context.getBean("samosa");
//        System.out.println(samosa +"\n");


//        registerShutdownHook() is present in AbstractApplicationContext
        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("configlyfecycle.xml");
//        Samosa samosa1 = (Samosa) context1.getBean("samosa");
//        System.out.println(samosa1+"\n");
        context1.registerShutdownHook(); //registering shutdown hook, so that our custom defined destroy method should execute

//        Pepsi pepsi = (Pepsi) context1.getBean("pepsi");
//        System.out.println(pepsi);

        Example example = (Example) context1.getBean("example");
        System.out.println(example);
    }
}
