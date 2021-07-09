package com.example.recettes.cuisine.repository;

import com.example.recettes.cuisine.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    public List<Categorie> findAllByNomcateg(String nom);
}
