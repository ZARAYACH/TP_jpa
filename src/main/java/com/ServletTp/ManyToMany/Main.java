package com.ServletTp.ManyToMany;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {
    private static String PERSISTENCE_UNIT_NAME = "tp_mavenjpa";

    public static void main(String[] args) {
        EntityManager entityManagerFactory = Persistence
                .createEntityManagerFactory(PERSISTENCE_UNIT_NAME)
                .createEntityManager();
        entityManagerFactory.getTransaction().begin();

        Etudiant etudiant = new Etudiant();

        Module module = new Module("Architecture Distribuées & Design Patterns");

        entityManagerFactory.persist(etudiant);
        entityManagerFactory.persist(module);


        etudiant.addModule(module);
        module.addEtudiant(etudiant);

        entityManagerFactory.persist(etudiant);
        entityManagerFactory.getTransaction().commit();

    }
}