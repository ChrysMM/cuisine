package com.example.recettes.cuisine.controller;

import com.example.recettes.cuisine.entity.Recette;
import com.example.recettes.cuisine.service.RecettesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RecettesController {
    @Autowired
    RecettesService recettesService;

   // @GetMapping("recettes")
   // public List<Recettes> getRecettes(){

   // return recettesService.getRecettes();
//}
    @PostMapping("recettes")
    public String addRecette(@RequestBody Recette r) {
        return recettesService.addRecette(r);
    }

}
