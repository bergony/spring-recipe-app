package com.example.springrecipeapp.services;

import com.example.springrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipe();
}
