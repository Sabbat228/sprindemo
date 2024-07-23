package ru.corus.sprindemo.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.corus.sprindemo.model.Student;
import ru.corus.sprindemo.repository.StudenRepository;
import ru.corus.sprindemo.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements StudentService {
    private final StudenRepository studenRepository;
    @Override
    public List<Student> findAllStudent() {
        return studenRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studenRepository.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return studenRepository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return studenRepository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(String email) {
        studenRepository.deleteByEmail(email);
    }
}
