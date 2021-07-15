package com.example.recettes.cuisine.repository;

import com.example.recettes.cuisine.entity.Recette;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecettesRepository extends JpaRepository<Recette, Long> {

    public List<Recette> findAllByNom(String nom);
}


