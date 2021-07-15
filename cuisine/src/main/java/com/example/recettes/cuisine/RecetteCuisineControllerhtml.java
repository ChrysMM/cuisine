package com.example.recettes.cuisine;

import com.example.recettes.cuisine.service.RecettesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class RecetteCuisineControllerhtml{
    @Autowired
    RecettesService recettesService;

    @GetMapping("layout")
    public String getLayout(){
        return "layout";
    }

    @GetMapping("all")
    public String showAll(Model model) {
        model.addAttribute("recette", recettesService.getRecettes());
        return "recettes";
    }
    @GetMapping("recette/{id}")
    public String getRecette(@PathVariable Long id){
        return "recette";
    }

    @GetMapping("ajout-recette")
    public String addRecetteForm() {
        return "ajout-recette";
    }

    @GetMapping("edit-recette")
    public String addRecetteForm(@PathVariable("id") Long id, Model model) {

        model.addAttribute("recette", recettesService.getRecettes());
        return "edit-recette";
    }
}