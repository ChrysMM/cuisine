package com.example.recettes.cuisine.service;

import com.example.recettes.cuisine.entity.Recettes;
import com.example.recettes.cuisine.repository.RecettesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecettesService {
    @Autowired
    RecettesRepository recettesRepository;

    public List<Recettes> getRecettes() {

        return recettesRepository.findAll();
    }

    public String addRecettes(Recettes recettes) {

        recettesRepository.save(recettes);

        return recettes + " a bien été ajouté à la base";
    }

    public void save(Recettes recettes) {
        recettesRepository.save(recettes);
    }

}
