package org.hackaboss.c5d6ejercicio1.service;

import org.hackaboss.c5d6ejercicio1.model.Rating;
import org.hackaboss.c5d6ejercicio1.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService implements IStrudentService {

    List<Student> students = Arrays.asList(
            new Student(1L, "John", "Doe", LocalDate.of(1990, 1, 2)),
            new Student(2L, "Jane", "Doe", LocalDate.of(1989, 12, 24)),
            new Student(3L, "Peter", "Griffin", LocalDate.of(1999, 10, 15)),
            new Student(4L, "Bart", "Simpson", LocalDate.of(1999, 10, 15))
    );




    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Rating getStudentRating(Long studentId) {
        return null;
    }
}
