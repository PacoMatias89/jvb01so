package org.hackaboss.c5d6ejercicio1.service;

import org.hackaboss.c5d6ejercicio1.model.Rating;
import org.hackaboss.c5d6ejercicio1.model.Student;

import java.util.List;

public interface IStrudentService {

    public List<Student> getAllStudents();
    public Rating getStudentRating(Long studentId);



}
