package com.example.recettes.cuisine.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomcateg;

    public Categorie() {
    }

    public Categorie(Long id, String nomcategateg) {
        this.id = id;
        this.nomcateg = nomcateg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomcateg() {
        return nomcateg;
    }

    public void setNomcateg(String nomcateg) {
        this.nomcateg = nomcateg;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "id=" + id +
                ", nomcateg='" + nomcateg + '\'' +
                '}';
    }
}
