package org.example.backend;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import org.example.entities.Group;
import org.example.entities.Teacher;

public class TeachersManager {
    EntityManager em;
    public TeachersManager(EntityManager em)
    {
        this.em = em;
    }
    public long count(String entityName)
    {
        String qStr = "SELECT COUNT(*) FROM" + entityName;
        Query countQuery = em.createQuery(qStr);
        return (long) countQuery.getSingleResult();
    }
    public Teacher getTeacher(long id)
    {
        em.getTransaction().begin();
        Teacher t = em.find(Teacher.class, 1);
        t.print();
        em.getTransaction().commit();
        return t;
    }
    private Group getGroup(long id)
    {
        Group g = em.find(Group.class, id);
        return g;
    }
    public long addTeacher(String fName, String lName, int yOB, double salary, String cond, long groupId)
    {
        em.getTransaction().begin();

        Teacher t = new Teacher();
        t.setFName(fName);
        t.setLName(lName);
        t.setYOB(yOB);
        t.setSalary(salary);
        t.setCond(cond);
        t.setGroup(getGroup(groupId));

        em.persist(t);
        long id = t.getId();

        em.getTransaction().commit();
        return id;
    }
    public long addGroup(String name, int maxFilling)
    {
        em.getTransaction().begin();

        Group g = new Group();
        g.setName(name);
        g.setMaxFilling(maxFilling);

        em.persist(g);
        long id = g.getId();

        em.getTransaction().commit();
        return id;
    }
}
