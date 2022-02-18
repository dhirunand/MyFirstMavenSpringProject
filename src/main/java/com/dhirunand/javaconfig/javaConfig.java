package com.dhirunand.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // this says that this class handles configuration(bean, component scan, ...)
//@ComponentScan(basePackages = "com.dhirunand.javaconfig")  //which package to scan to get bean(container kis package ko scan krega aapne bean ko pane ke liye)
public class javaConfig {

    @Bean(name = {"samosa", "getSamosa", "temp"})
    public Samosa getSamosa() {
        return new Samosa();
    }


    @Bean
    public Student getStudent() {
        Student student = new Student(getSamosa());

        return student;
    }
}
