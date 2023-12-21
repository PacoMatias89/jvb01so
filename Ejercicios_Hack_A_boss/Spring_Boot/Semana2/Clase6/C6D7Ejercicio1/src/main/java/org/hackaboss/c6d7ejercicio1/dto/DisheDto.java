package org.hackaboss.c6d7ejercicio1.dto;

import lombok.*;
import org.hackaboss.c6d7ejercicio1.model.Ingredient;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class DisheDto {
    private Long plateCode;
    private String name;
    private Double amountCalories;
    private Ingredient maxCaloriesIngredient;
    private List<Ingredient> ingredients = new ArrayList<>();
}
