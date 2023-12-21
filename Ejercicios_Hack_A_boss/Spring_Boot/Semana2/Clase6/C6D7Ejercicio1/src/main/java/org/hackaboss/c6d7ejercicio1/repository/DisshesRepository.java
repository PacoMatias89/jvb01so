package org.hackaboss.c6d7ejercicio1.repository;

import org.hackaboss.c6d7ejercicio1.dto.DisheDto;
import org.hackaboss.c6d7ejercicio1.model.Dishes;
import org.hackaboss.c6d7ejercicio1.model.Ingredient;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DisshesRepository {

    @Autowired
    private IngredientRepository ingredientRepository;

    public static final String DISHES_JSON = "src/main/resources/dishes.json";

    public List<DisheDto> getDishesByJson() {
        List<DisheDto> dishes = new ArrayList<>();

        try (FileReader fileReader = new FileReader(DISHES_JSON)) {
            JSONTokener tokener = new JSONTokener(fileReader);
            JSONArray dishesArray = new JSONArray(tokener);

            for (int i = 0; i < dishesArray.length(); i++) {
                JSONObject dishJson = dishesArray.getJSONObject(i);
                DisheDto dish = new DisheDto();
                dish.setPlateCode(dishJson.getLong("id"));
                dish.setName(dishJson.getString("nombre"));


                List<Object> ingredientsIds = dishJson.getJSONArray("ingredientes").toList();List<Ingredient> ingredients = ingredientRepository.getIngredientsByJson();
                dish.setIngredients(ingredients.stream().toList());

                dishes.add(dish);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dishes;
    }

    //Obtengo el plato por el nombre
    public DisheDto getDishesByName(String name) {
        return getDishesByJson()
                .stream()
                .filter(dish -> dish.getName().equals(name))
                .findFirst().get();

    }
}
