package com.hackaboss.c3d4ejercicio3_opcional.model;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Event {

    private int id;
    private String title;
    private String description;
    private String date;
    private String hour;
    private String location;
    private String teacher;

}
