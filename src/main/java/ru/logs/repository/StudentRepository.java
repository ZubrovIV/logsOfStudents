package ru.logs.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.logs.models.Student;

import java.util.List;

@Repository
public class StudentRepository {
    private JdbcTemplate jdbcTemplate;


    @Autowired
    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Student> getAll() {
        return jdbcTemplate.query("select * from student", new BeanPropertyRowMapper<>(Student.class));
    }

    public Student getByName(String name) {
        return jdbcTemplate.query("select * from Student where fullname=?", new Object[]{name}, new BeanPropertyRowMapper<>(Student.class))
                .stream().findAny().orElseThrow(() -> new RuntimeException("Нет такого человека"));
    }

    public void create(Student student) {
        jdbcTemplate.update("insert into Student(fullname) values(?)", student.getFullname());
    }
}

