package com.example.recettes.cuisine.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Recettes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nom;


    public Recettes() {
    }

    public Recettes(Long id, String nom, String categorie) {
        this.id = id;
        this.nom = nom;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



    @Override
    public String toString() {
        return "Recettes{" +
                "id=" + id +
                ", nom='" + nom + '\'' +

                '}';
    }
}
