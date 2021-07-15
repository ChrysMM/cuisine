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
    private String details;

    public Details() {
    }

    public Details(Long id, String details) {
        this.id = id;
        this.details = details;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", details='" + details + '\'' +
                '}';
    }
}
