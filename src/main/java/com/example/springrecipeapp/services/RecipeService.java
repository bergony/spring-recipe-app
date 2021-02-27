package com.example.springrecipeapp.services;

import com.example.springrecipeapp.domain.Recipe;
import lombok.Data;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();

    Object findById(long anyLong);
}
