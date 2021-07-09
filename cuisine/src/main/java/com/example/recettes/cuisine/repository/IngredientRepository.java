package com.example.recettes.cuisine.repository;

import com.example.recettes.cuisine.entity.Categorie;
import com.example.recettes.cuisine.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
    public List<Ingredient> findAllByNomingred(String nom);
}
