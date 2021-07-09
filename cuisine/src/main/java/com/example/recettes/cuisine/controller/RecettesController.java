package com.example.recettes.cuisine.controller;

import com.example.recettes.cuisine.entity.Recettes;
import com.example.recettes.cuisine.service.RecettesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class RecettesController {
    @Autowired
    RecettesService recettesService;

    @GetMapping("recettes")
    public List<Recettes> getRecettes(){

    return recettesService.getRecettes();
}
    @PostMapping("recettes")
    public String addRecettes(@RequestBody Recettes r) {
        return recettesService.addRecettes(r);
    }

}
