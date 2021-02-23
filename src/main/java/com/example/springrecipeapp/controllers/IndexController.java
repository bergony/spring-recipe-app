package com.example.springrecipeapp.controllers;

import com.example.springrecipeapp.domain.Category;
import com.example.springrecipeapp.domain.UnitOfMeasure;
import com.example.springrecipeapp.repositories.CategoryRepository;
import com.example.springrecipeapp.repositories.UnitOfMeasureRepository;
import com.example.springrecipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipe());
        return "index";
    }
}
