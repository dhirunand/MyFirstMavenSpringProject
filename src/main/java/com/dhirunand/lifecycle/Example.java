package com.dhirunand.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String subject;

    public Example() {
    }

    public Example(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @PostConstruct  //PostConstruct means Post initialization of variable. init() method
    public void start(){System.out.println("starting method");}

    @PreDestroy  //PreDestroy means just b4 destroyal means destroy() method
    public void end(){System.out.println("ending method");}
}
