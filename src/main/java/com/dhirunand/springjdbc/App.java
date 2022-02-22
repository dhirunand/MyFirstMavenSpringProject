package com.dhirunand.springjdbc;

import com.dhirunand.springjdbc.dao.StudentDao;
import com.dhirunand.springjdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


public class App {
    public static void main(String[] args) {
        System.out.println("My program started...");

        //spring jdbc ==> JdbcTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("configspringjdbc.xml");
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

//        //insert
//        String query = "insert into student(id, name, city) values(?, ?, ?)";
//
//        //fire query
//        int result = jdbcTemplate.update(query, 46, "Manish Kumar", "Kanpur");
//        System.out.println("number of record inserted.."+result);


/*
        //insert

        StudentDao studentDao = context.getBean("studentDaoImpl", StudentDao.class);

        Student student = new Student();
        student.setId(666);
        student.setName("Dhiru");
        student.setCity("Kolkata");

        int result = studentDao.insert(student);
        System.out.println("number of record inserted.." + result);
 */

/*
        //update
        StudentDao studentDao = context.getBean("studentDaoImpl", StudentDao.class);

        //update student with id 666
        Student student = new Student();
        student.setId(666);
        student.setName("Dku");
        student.setCity("Patna");

        int result = studentDao.update(student);
        System.out.println("number of record inserted.." + result);

 */

/*
        //delete
        int res = studentDao.delete(666); // res is no.. of rows deleted

 */

/*
        //fetch a single value
        StudentDao studentDao = context.getBean("studentDaoImpl", StudentDao.class);
        Student student = studentDao.getStudent(222);
        System.out.println(student);

 */

        //fetch multiple value
        StudentDao studentDao = context.getBean("studentDaoImpl", StudentDao.class);
        List<Student> studentList = studentDao.getAllStudent();
        for (Student s : studentList)
            System.out.println(s);


    }
}
