package ru.corus.sprindemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.corus.sprindemo.model.Student;

public interface StudenRepository extends JpaRepository <Student, Long>{
    void deleteByEmail(String email);
    Student findStudentByEmail(String email);
}
