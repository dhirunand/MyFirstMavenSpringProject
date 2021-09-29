package com.dhirunand;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


//        StudentBeanOrPojo studentBeanOrPojo = new StudentBeanOrPojo(8098, "Dhiraj", "Vasundhara Complex");
//        System.out.println(studentBeanOrPojo);

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        StudentBeanOrPojo studentBeanOrPojo = (StudentBeanOrPojo) context.getBean("student1");
        System.out.println(studentBeanOrPojo);

    }
}
