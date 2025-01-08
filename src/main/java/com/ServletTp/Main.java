package com.ServletTp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static String PERSISTENCE_UNIT_NAME = "tp_maven";

    public static void main(String[] args) {
        EntityManager entityManagerFactory = Persistence
                .createEntityManagerFactory(PERSISTENCE_UNIT_NAME)
                .createEntityManager();

    }
}