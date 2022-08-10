package ru.logs.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.logs.models.Logs;

import java.util.List;

@Repository
public class LogsRepository {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public LogsRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Logs> getAllByStudentName(int id) {
        return jdbcTemplate.query("select * from logs where id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Logs.class));
    }

    public void creatLog(Logs logs) {
        jdbcTemplate.update("insert into Logs (id,message,date) values(?,?,?)", logs.getId(), logs.getMessage(), logs.getDate());
    }
}
