package com.rightnow.recipes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @PostMapping("/search")
    public List<Recipe> searchRecipes(@RequestBody List<String> ingredients) {
        return recipeService.searchRecipes(ingredients);
    }
}
