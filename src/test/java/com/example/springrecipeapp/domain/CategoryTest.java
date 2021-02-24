package com.example.springrecipeapp.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CategoryTest {

    Category category;

    @BeforeEach
    public void setup(){
        category = new Category();
    }

    @Test
    void getId() {
        Long idValue = 4l;
         
        category.setId(idValue);
        
        assertEquals(idValue, category.getId());
        
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}