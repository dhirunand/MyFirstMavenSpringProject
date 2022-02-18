package com.dhirunand.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // @Component("ob") <-- if u want to change object name from default name(student)
public class Student {
    @Value("Dhiraj Kumar")
    private String studentName;

    @Value("Kolkata")
    private String city;

    @Value("#{temp}") //Spring Expression Language (SpEL)
    public List<String> address;



    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
