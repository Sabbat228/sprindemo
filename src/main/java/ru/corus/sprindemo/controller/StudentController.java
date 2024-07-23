package ru.corus.sprindemo.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.corus.sprindemo.model.Student;
import ru.corus.sprindemo.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;
    @GetMapping
    public List<Student> findAllStudent(){
        return studentService.findAllStudent();
    }
    @PostMapping("save_student")
    public String saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "student successfully saved";
    }
    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email){
        return studentService.findByEmail(email);
    }
    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable String email){
        studentService.deleteStudent(email);
    }
}
