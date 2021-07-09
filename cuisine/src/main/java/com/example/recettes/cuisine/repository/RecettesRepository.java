package com.example.recettes.cuisine.repository;

import com.example.recettes.cuisine.entity.Recettes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecettesRepository extends JpaRepository<Recettes, Long> {

    public List<Recettes> findAllByNom(String nom);
}


