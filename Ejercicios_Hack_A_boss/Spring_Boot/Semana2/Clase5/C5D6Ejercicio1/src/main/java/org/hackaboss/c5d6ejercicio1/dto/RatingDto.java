package org.hackaboss.c5d6ejercicio1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RatingDto {
    private Long id;
    private Double averageRating;
    private String name;
}
