package com.ServletTp.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {
    private static String PERSISTENCE_UNIT_NAME = "tp_mavenjpa";

    public static void main(String[] args) {
        EntityManager entityManagerFactory = Persistence
                .createEntityManagerFactory(PERSISTENCE_UNIT_NAME)
                .createEntityManager();
        entityManagerFactory.getTransaction().begin();
        Personne personne = new Personne("test esttt");
        Professeur professeur = new Professeur("sdf");

        personne.setProfesseur(professeur);
        professeur.setPersonne(personne);

        entityManagerFactory.persist(professeur);
        entityManagerFactory.persist(personne);

        entityManagerFactory.getTransaction().commit();
        entityManagerFactory.close();

    }
}