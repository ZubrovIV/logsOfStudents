package ru.logs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.logs.models.Student;
import ru.logs.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAll();
    }

    public Student getByName(String name) {
        return studentRepository.getByName(name);
    }
    public void createStudent (Student student){
        studentRepository.create(student);
    }
}
