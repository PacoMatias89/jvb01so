package org.hackaboss.c6d7ejercicio1.repository;

import org.hackaboss.c6d7ejercicio1.model.Ingredient;
import org.springframework.stereotype.Repository;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

@Repository
public class IngredientRepository {

    public static final String INGREDIENT_JSON = "src/main/resources/ingredients.json";

    public List<Ingredient> getIngredientsByJson() {
        List<Ingredient> ingredients = new ArrayList<>();

        try (FileReader fileReader = new FileReader(INGREDIENT_JSON)) {
            JSONTokener tokener = new JSONTokener(fileReader);
            JSONArray jsonArray = new JSONArray(tokener);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject ingredientJson = jsonArray.getJSONObject(i);
                Ingredient ingredient = new Ingredient();
                ingredient.setIngredientCode(ingredientJson.getLong("id"));
                ingredient.setName(ingredientJson.getString("name"));
                ingredient.setAmountCalories(ingredientJson.getInt("calories"));
                ingredients.add(ingredient);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ingredients;
    }
}
