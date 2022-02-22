package com.dhirunand.springjdbc;

import com.dhirunand.springjdbc.dao.StudentDao;
import com.dhirunand.springjdbc.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class JdbcJavaConfig {

    @Bean
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();  //<== DataSource is an interface which is indirectly implemented by DriverManagerDataSource

        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");

        return dataSource;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(DriverManagerDataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource); // or by setter, jdbcTemplate.setDataSource(dataSource);

        return jdbcTemplate;
    }

    @Bean
    public StudentDao getStudentDao(JdbcTemplate jdbcTemplate){
        StudentDaoImpl studentDaoImpl = new StudentDaoImpl();

        studentDaoImpl.setJdbcTemplate(jdbcTemplate);

        return studentDaoImpl;

    }
}
