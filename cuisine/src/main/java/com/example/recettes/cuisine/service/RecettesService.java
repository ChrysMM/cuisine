package com.example.recettes.cuisine.service;

import com.example.recettes.cuisine.entity.Recette;
import com.example.recettes.cuisine.repository.RecettesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecettesService {
  @Autowired
    RecettesRepository recettesRepository;

    public List<Recette> getRecettes() {

       return recettesRepository.findAll();
    }

    public String addRecette(Recette recette) {

        recettesRepository.save(recette);

        return recette + " a bien été ajouté à la base";
    }

    public void save(Recette recette) {
        recettesRepository.save(recette);
    }

}
