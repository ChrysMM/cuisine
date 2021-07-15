package com.example.recettes.cuisine.service;

import com.example.recettes.cuisine.entity.Categorie;
import com.example.recettes.cuisine.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {
    @Autowired
    CategorieRepository categorieRepository;

    public List<Categorie> getCategorie() {

        return categorieRepository.findAll();
    }

    public String addCategorie(Categorie categorie) {

        categorieRepository.save(categorie);

        return categorie + " a bien été ajouté à la base";
    }

    public void save(Categorie categorie) {
        categorieRepository.save(categorie);
    }

}
