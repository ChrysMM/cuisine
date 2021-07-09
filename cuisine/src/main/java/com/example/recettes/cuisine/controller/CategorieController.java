package com.example.recettes.cuisine.controller;

import com.example.recettes.cuisine.entity.Categorie;
import com.example.recettes.cuisine.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CategorieController {
    @Autowired
    CategorieService categorieService;

    @GetMapping("categorie")
    public List<Categorie> getCategorie(){

        return categorieService.getCategorie();
    }
    @PostMapping("categorie")
    public String addCategorie(@RequestBody Categorie c) {
        return categorieService.addCategorie(c);
    }

}
