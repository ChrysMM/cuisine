package com.example.recettes.cuisine.controller;

import com.example.recettes.cuisine.entity.Categorie;
import com.example.recettes.cuisine.entity.Ingredient;
import com.example.recettes.cuisine.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IngredientController {
    @Autowired
    IngredientService ingredientService;

    @GetMapping("ingredient")
    public List<Ingredient> getIngredient(){

        return ingredientService.getIngredient();
    }
    @PostMapping("ingredient")
    public String addIngredient(@RequestBody Ingredient i) {
        return ingredientService.addIngredient(i);
    }
}
