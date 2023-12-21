package org.hackaboss.c5d6ejercicio1.controller;

import org.hackaboss.c5d6ejercicio1.model.Student;
import org.hackaboss.c5d6ejercicio1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {


    @Autowired
    private StudentService studentService;


    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


}
