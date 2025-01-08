package com.ServletTp.OneToOne;

import javax.persistence.*;

@Entity
@Table(name = "professeur")
public class Professeur {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Professeur(String name) {
        this.name = name;
    }

    @OneToOne
    private Personne personne;

    public Professeur() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
}
