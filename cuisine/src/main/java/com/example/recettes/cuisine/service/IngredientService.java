package com.example.recettes.cuisine.service;

import com.example.recettes.cuisine.entity.Categorie;
import com.example.recettes.cuisine.entity.Ingredient;
import com.example.recettes.cuisine.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {
  @Autowired
    IngredientRepository ingredientRepository;
    public List<Ingredient> getIngredient() {

        return  ingredientRepository.findAll();
    }

    public String addIngredient(Ingredient ingredient) {

        ingredientRepository.save(ingredient);

        return ingredient + " a bien été ajouté à la base";
    }

    public void save(Ingredient ingredient) {
        ingredientRepository.save(ingredient);
    }



}
