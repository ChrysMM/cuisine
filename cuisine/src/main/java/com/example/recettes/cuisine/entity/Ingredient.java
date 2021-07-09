package com.example.recettes.cuisine.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomingred;

    public Ingredient() {
    }

    public Ingredient(Long id, String nomingred) {
        this.id = id;
        this.nomingred = nomingred;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomingred() {
        return nomingred;
    }

    public void setNomingred(String nomingred) {
        this.nomingred = nomingred;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", nomingred='" + nomingred + '\'' +
                '}';
    }
}
