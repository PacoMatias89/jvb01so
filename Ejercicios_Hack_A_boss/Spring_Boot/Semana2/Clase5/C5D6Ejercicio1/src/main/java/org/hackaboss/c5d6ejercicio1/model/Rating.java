package org.hackaboss.c5d6ejercicio1.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rating {
    private Long id;
    private Double rating1;
    private Double rating2;
    private Double rating3;
    private Double averageRating;
    private List<Student> students = new ArrayList<>();
}
