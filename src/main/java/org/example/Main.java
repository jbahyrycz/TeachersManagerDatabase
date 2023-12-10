package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.entities.Teacher;
import org.example.entities.Group;
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
            Teacher t1 = em.find(Teacher.class, 1);
            t1.print();

            /*Teacher t = new Teacher();
            t.setId(1L);
            t.setFName("Julia");
            t.setLName("Bahyrycz");
            t.setYOB(2003);
            t.setSalary(7000.0);
            t.setCondition("present");

            em.persist(t);
            em.getTransaction().commit();

            em.getTransaction().begin();

            Group g = new Group();
            g.setId(1L);
            g.setName("Mathematicians");
            g.setMaxFilling(10);

            em.persist(g);
            em.getTransaction().commit();*/
        }
        finally
        {
            em.close();
        }
    }
}