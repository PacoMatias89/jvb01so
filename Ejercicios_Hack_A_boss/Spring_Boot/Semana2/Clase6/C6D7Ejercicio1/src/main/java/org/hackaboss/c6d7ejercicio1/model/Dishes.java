package org.hackaboss.c6d7ejercicio1.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dishes {
    private Long plateCode;
    private String name;
    private Double price;
    private List<Ingredient> ingredients = new ArrayList<>();

}
