package com.dhirunand.springjdbc.dao;

import com.dhirunand.springjdbc.entities.Student;

import java.util.List;

/**
 * Benefits of this interface
 *  Loose coupling: bad me jb kuch change krna pde to bs StudentDaoImpl.java me change hoga baki sb(App.java(jaha-2 bhi use huaa h)) me kuch nhi kynki baki sbhi jagah to StudentDao
 *                  ka object bnaye h jo ki interface h aur isme ke luch change huaa nhii h
 */

public interface StudentDao {
    public int insert(Student student);


    public int update(Student student);

    public int delete(int studentId);

    //RowMapper maps a row to a java object

    public Student getStudent(int studentId);

    public List<Student> getAllStudent();
}
