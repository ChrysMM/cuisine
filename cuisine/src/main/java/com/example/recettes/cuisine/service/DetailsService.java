package com.example.recettes.cuisine.service;

import com.example.recettes.cuisine.entity.Categorie;
import com.example.recettes.cuisine.entity.Details;
import com.example.recettes.cuisine.repository.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailsService {
    @Autowired
    DetailsRepository detailsRepository;

    public List<Details> getDetails() {

        return detailsRepository.findAll();
    }

    public String addDetails(Details details) {

        detailsRepository.save(details);

        return details + " a bien été ajouté à la base";
    }

    public void save(Details details) {
        detailsRepository.save(details);
    }

}
