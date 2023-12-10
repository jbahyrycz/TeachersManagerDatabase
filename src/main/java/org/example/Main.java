package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.entities.Teachers;
import org.example.persistence.CustomPersistenceUnitInfo;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;

public class Main {
    public static void main(String[] args)
    {
        EntityManagerFactory emf = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(new CustomPersistenceUnitInfo(), new HashMap<>());

        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();

            Teachers t = new Teachers();
            t.setId(1L);
            t.setFirstName("Julia");
            t.setLastName("Bahyrycz");
            t.setYearOfBirth(2003);
            t.setSalary(7000.0);
            t.setCondition("present");

            em.persist(t);
            em.getTransaction().commit();
        }
        finally {
            em.close();
        }
    }
}