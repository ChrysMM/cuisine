package com.example.recettes.cuisine.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String detailsrecette;

    public Details() {
    }

    public Details(Long id, String detailsrecette) {
        this.id = id;
        this.detailsrecette = detailsrecette;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetailsrecette() {
        return detailsrecette;
    }

    public void setDetailsrecette(String detailsrecette) {
        this.detailsrecette = detailsrecette;
    }

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", detailsrecette='" + detailsrecette + '\'' +
                '}';
    }
}
