package org.hackaboss.c6d7ejercicio1.service;

import org.hackaboss.c6d7ejercicio1.dto.DisheDto;
import org.hackaboss.c6d7ejercicio1.model.Dishes;
import org.hackaboss.c6d7ejercicio1.model.Ingredient;
import org.hackaboss.c6d7ejercicio1.repository.DisshesRepository;
import org.hackaboss.c6d7ejercicio1.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;
@Service
public class DischeService implements IDischesService {

    @Autowired
    private DisshesRepository dishesRepository;

    @Autowired
    private IngredientRepository ingredientService;



    @Override
    public DisheDto getDishesByName(String disheName) {
        DisheDto disheDto = dishesRepository.getDishesByName(disheName);
        List<Ingredient> ingredients = disheDto.getIngredients();

        //Calcular el total de las calorías
        double totalCalories = ingredients.stream()
                .mapToDouble(Ingredient::getAmountCalories)
                .sum();

        //Obtener el ingrediente con mayor calorías
        Ingredient maxCalories = ingredients.stream()
                .max(Comparator.comparing(Ingredient::getAmountCalories))
                .orElse(null);

        DisheDto disheDtoIngfo = new DisheDto();
        disheDtoIngfo.setAmountCalories(totalCalories);
        disheDtoIngfo.setPlateCode(disheDto.getPlateCode());
        disheDtoIngfo.setName(disheDto.getName());
        disheDtoIngfo.setIngredients(ingredients);
        disheDtoIngfo.setMaxCaloriesIngredient(maxCalories);



        return disheDtoIngfo;
    }




}
