package ru.logs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.logs.models.Logs;
import ru.logs.models.Student;
import ru.logs.repository.LogsRepository;
import ru.logs.repository.StudentRepository;

import java.util.List;

@Service
public class LogsService {
    private StudentRepository studentRepository;
    private LogsRepository logsRepository;

    @Autowired
    public LogsService(StudentRepository studentRepository, LogsRepository logsRepository) {
        this.studentRepository = studentRepository;
        this.logsRepository = logsRepository;
    }

    public List<Logs> getAllByStudentName(String name) {
        Student student = studentRepository.getByName(name);
        int id = student.getId();
        return logsRepository.getAllByStudentName(id);
    }
    public void creatLogByNameOfStudent(Logs logs,String name){
        Student student = studentRepository.getByName(name);
        int id = student.getId();
        logs.setId(id);
        logsRepository.creatLog(logs);
    }

}
