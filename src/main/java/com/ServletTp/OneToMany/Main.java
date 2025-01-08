package com.ServletTp.OneToMany;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {
    private static String PERSISTENCE_UNIT_NAME = "tp_mavenjpa";

    public static void main(String[] args) {
        EntityManager entityManagerFactory = Persistence
                .createEntityManagerFactory(PERSISTENCE_UNIT_NAME)
                .createEntityManager();
        entityManagerFactory.getTransaction().begin();

        Departement dep = new Departement("Info");

        Address add1 = new Address("123 Rue Principale");
        add1.setDepartement(dep);

        Address add2 = new Address("456 Rue Secondaire");
        add2.setDepartement(dep);

        dep.addAddress(add1);
        dep.addAddress(add2);

        entityManagerFactory.persist(add1);
        entityManagerFactory.persist(add2);

        entityManagerFactory.persist(dep);
        entityManagerFactory.getTransaction().commit();
        entityManagerFactory.close();

    }
}