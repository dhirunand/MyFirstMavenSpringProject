package com.dhirunand.springjdbc.dao;

import com.dhirunand.springjdbc.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;


//@Component("studentDao")  // passing name coz automatic jo create hoga wo studentDaoImpl iss name se hoga  //            <== Autowiring
public class StudentDaoImpl implements StudentDao {
//    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        //insert
        String query = "insert into student(id, name, city) values(?, ?, ?)";
        int result = jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return result;
    }

    @Override
    public int update(Student student) {
        //update
        String query = "update student set name=?, city=? where id=?";
        int result = jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
        return result;
    }

    @Override
    public int delete(int studentId) {
        //delete
        String query = "delete from student where id=?";
        int result = jdbcTemplate.update(query, studentId);
        return result;
    }

    @Override
    public Student getStudent(int studentId) {
        //get student from studentId
        String query = "select * from student where id=?";

        RowMapper<Student> rowMapper = new RowMapperImpl();

        Student student = jdbcTemplate.queryForObject(query, rowMapper, studentId);
//        Student student = jdbcTemplate.queryForObject(query, new RowMapper<Student>() { // <== using anonymous inner class
//            @Override
//            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
//                Student student = new Student();
//
//                student.setId(resultSet.getInt(1));
//                student.setName(resultSet.getString(2));
//                student.setCity(resultSet.getString(3));
//
//                return student;
//            }
//        }, studentId);

        return student;
    }

    @Override
    public List<Student> getAllStudent() {
        //get all students
        String query = "select * from student";
        List<Student> studentList = jdbcTemplate.query(query, new RowMapperImpl());
        return studentList;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
