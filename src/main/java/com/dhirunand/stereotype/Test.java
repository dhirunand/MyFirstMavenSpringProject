package com.dhirunand.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("configstereotype.xml");

        Student student = context.getBean("student", Student.class);
        System.out.println(student);


        System.out.println(student.getAddress());
        System.out.println(student.getAddress().getClass().getName());


/**
 * Spring Bean Scope
 * 1. singleton : ek hi object banayega aur jb bhi manenge to wahi wala br-2 dega
 * 2. prototype : br-br new object banayega spring container jb bhi hm context.getBean() krenge
 * 3. request
 * 4. session
 * 5. globalsession
 */


        Student student2 = context.getBean("student", Student.class);
        System.out.println(student.hashCode() + " "+ student2.hashCode()); //same hashCode, i.e bt default IOC Container creates singleton class


        /**
         * Configure bean scope
         *  1. <bean class="" name = "" scope="" />
         *  2. @Component
         *     @Scope
         *     class Student{...}
         */
    }
}
