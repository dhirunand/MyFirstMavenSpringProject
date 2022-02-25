package com.dhirunand.springorm;

import com.dhirunand.springorm.dao.StudentDao;
import com.dhirunand.springorm.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.util.List;
import java.util.Scanner;

/**
 * CRUD
 * C : Create
 * R : Read
 * U : Update
 * D : Delete
 */

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("My program started...");

        ApplicationContext context = new ClassPathXmlApplicationContext("configspringorm.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        //insert
//        Student student = new Student(8098, "Dhiraj Kumar", "Kolkata");
//        int res = studentDao.insert(student);
//        System.out.println("inserted :" + res);

        /**
         * Console based CRUD application
         */


        System.out.println("**********Welcome to spring orm project**********");
        int choice = 0;
        while (choice != 6) {
            System.out.println("PRESS 1 for add new student");
            System.out.println("PRESS 2 for display all student");
            System.out.println("PRESS 3 for get details of single student");
            System.out.println("PRESS 4 for delete a student");
            System.out.println("PRESS 5 for update student");
            System.out.println("PRESS 6 for exit");

            choice = sc.nextInt();
            switch (choice) {
                case 1:  // add
                    System.out.println("Enter student ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter student name : ");
                    String sName = sc.nextLine();

                    System.out.println("Enter student city : ");
                    String sCity = sc.nextLine();

                    Student student = new Student(id, sName, sCity);
                    int res = studentDao.insert(student);
                    System.out.println("inserted :" + res);

                    System.out.println("*************************");

                    break;
                case 2:  // display all student

                    List<Student> studentList = studentDao.getAllStudent();
                    for(Student s: studentList)
                        System.out.println(s);

                    break;
                case 3:  // get details of single student
                    System.out.println("Enter student ID : ");
                    int idDetails= sc.nextInt();
                    Student s1 = studentDao.getStudent(idDetails);
                    System.out.println(s1);

                    break;
                case 4:  // delete a student
                    System.out.println("Enter student ID : ");
                    int idDelete= sc.nextInt();
                    studentDao.deleteStudent(idDelete);
                    System.out.println("Deleted");

                    break;
                case 5:  // update student

                    break;
                case 6:  // exit

                    break;
            }
        }

        System.out.println("Thank you for using my application");

    }
}
