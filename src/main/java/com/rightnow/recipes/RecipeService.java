package com.rightnow.recipes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> searchRecipes(List<String> ingredients) {
        return recipeRepository.findByIngredientsIn(ingredients);
    }
}
