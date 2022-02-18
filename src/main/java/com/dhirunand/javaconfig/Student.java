package com.dhirunand.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component("firstStudent")
public class Student {
    private Samosa samosa;

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }
}
