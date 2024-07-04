package com.rightnow.recipes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Recipes")
public class Recipe {
    @Id
    private String id;
    private String name;
    private String source;
    private int preptime;
    private int waittime;
    private int cooktime;
    private int servings;
    private String comments;
    private int calories;
    private int fat;
    private int satfat;
    private int carbs;
    private int fiber;
    private int sugar;
    private int protein;
    private String instructions;
    private List<String> ingredients;
    private List<String> tags;

    // Getters and setters
}
