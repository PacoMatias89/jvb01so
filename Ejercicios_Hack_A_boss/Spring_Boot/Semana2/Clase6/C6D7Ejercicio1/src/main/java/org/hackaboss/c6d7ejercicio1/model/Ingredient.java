package org.hackaboss.c6d7ejercicio1.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ingredient {
    private Long ingredientCode;
    private String name;
    private int amountCalories;

}
