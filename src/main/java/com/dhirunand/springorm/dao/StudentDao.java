package com.dhirunand.springorm.dao;

import com.dhirunand.springorm.entity.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentDao {
    private HibernateTemplate hibernateTemplate;


    //insert/save student
    @Transactional // <- Transaction only write(insert, update, delete) ke case me need h, get me koi jarurat nhi
    public int insert(Student student) {
        int i = (Integer) this.hibernateTemplate.save(student);  // these all method gives exception so use try-catch and handle them
        return i;
    }

    //Fetch/get single data
//    @Transactional // <- Transaction only write(insert, update) ke case me need h, get me koi jarurat nhi
    public Student getStudent(int studentId) {
        Student student = this.hibernateTemplate.get(Student.class, studentId);  // these all method gives exception so use try-catch and handle them
        return student;
    }

    //Fetch/get all data
    public List<Student> getAllStudent() {
        List<Student> allStudent = this.hibernateTemplate.loadAll(Student.class);  // these all method gives exception so use try-catch and handle them
        return allStudent;
    }

    //delete
    @Transactional
    public void deleteStudent(int studentId){
        Student s1 = this.hibernateTemplate.get(Student.class, studentId);  // these all method gives exception so use try-catch and handle them
        this.hibernateTemplate.delete(s1);
    }

    //updating data
    @Transactional
    public void updateStudent(Student student){
        this.hibernateTemplate.update(student);  // these all method gives exception so use try-catch and handle them
    }


    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
