package com.example.recettes.cuisine.controller;

import com.example.recettes.cuisine.entity.Categorie;
import com.example.recettes.cuisine.entity.Details;
import com.example.recettes.cuisine.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DetailsController {
    @Autowired
    DetailsService detailsService;

    @GetMapping("details")
    public List<Details> getDetails(){

        return detailsService.getDetails();
    }
    @PostMapping("details")
    public String addDetails(@RequestBody Details d) {
        return detailsService.addDetails(d);
    }
}
