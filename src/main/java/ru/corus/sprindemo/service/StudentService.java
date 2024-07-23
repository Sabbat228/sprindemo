package ru.corus.sprindemo.service;

import org.springframework.stereotype.Service;
import ru.corus.sprindemo.model.Student;

import java.util.List;

@Service
public interface StudentService {
    List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
