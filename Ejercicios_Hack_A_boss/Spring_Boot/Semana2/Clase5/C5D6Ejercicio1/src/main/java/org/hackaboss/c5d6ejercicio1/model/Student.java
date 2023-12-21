package org.hackaboss.c5d6ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private Long numRegistration;
    private String name;
    private String lastName;
    private LocalDate birthDate;



}
