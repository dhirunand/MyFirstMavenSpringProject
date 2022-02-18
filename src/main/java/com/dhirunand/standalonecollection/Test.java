package com.dhirunand.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("configstandalonecollection.xml");

        Person person = context.getBean("person1", Person.class);
        System.out.println(person);
        System.out.println(person.getFriends().getClass().getName()+"\n\n");


        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person2);
        System.out.println(person.getFriends().getClass().getName());
        System.out.println(person2.getFeesStructure().getClass().getName());
    }
}
