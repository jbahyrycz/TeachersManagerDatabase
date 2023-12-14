package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.backend.TeachersManager;
import org.example.persistence.CustomPersistenceUnitInfo;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        String puName = "pu-name";
        Map<String, String> props = new HashMap<>();
        props.put("hibernate.show_sql", "true");
        props.put("hibernate.hbm2ddl.auto", "create"); // create or update

        EntityManagerFactory emf = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(new CustomPersistenceUnitInfo(puName), props);

        EntityManager em = emf.createEntityManager();

        try
        {
            TeachersManager tm = new TeachersManager(em);
            long g1Id = tm.addGroup("No group", 1000);
            long g2Id = tm.addGroup("Mathematicians", 10);
            long g3Id = tm.addGroup("English teachers", 5);
            long g4Id = tm.addGroup("Chemists", 3);
            long g5Id = tm.addGroup("Biologists", 3);

            long t1ID = tm.addTeacher("Jan", "Kowalski", 1999, 5000.0, "present", g1Id);
            long t2ID = tm.addTeacher("Adam", "Boczkowski", 1980, 7000.0, "absent", g1Id);
            long t3ID = tm.addTeacher("Julia", "Bahyrycz", 2003, 4550.0, "present", g1Id);
            long t4ID = tm.addTeacher("Anna", "Nowak", 1976, 8000.0, "present", g1Id);
            long t5ID = tm.addTeacher("Adrian", "Paw", 1993, 5000.0, "present", g2Id);
            long t6ID = tm.addTeacher("Grzegorz", "Ptak", 1977, 6867.50, "present", g1Id);
            long t7ID = tm.addTeacher("Joanna", "Wrona", 1984, 4500.0, "present", g2Id);
            long t8ID = tm.addTeacher("Piotr", "Baran", 1980, 6700.0, "on delegation", g3Id);
            long t9ID = tm.addTeacher("Roman", "Kowal", 1997, 3000.0, "sick", g3Id);
            long t10ID = tm.addTeacher("Barosz", "Kiepski", 1976, 9000.0, "sick", g1Id);
            long t11ID = tm.addTeacher("Emil", "Olszewski", 1985, 8000.0, "present", g2Id);
            long t12ID = tm.addTeacher("Zuzanna", "Grzybowski", 1978, 9500.0, "absent", g1Id);
            long t13ID = tm.addTeacher("Szymon", "Lisowski", 1990, 8700.0, "present", g1Id);
            long t14ID = tm.addTeacher("Oliwia", "Brzeziński", 1982, 9200.0, "present", g2Id);
            long t15ID = tm.addTeacher("Leon", "Chmielewski", 1976, 8900.0, "present", g1Id);
            long t16ID = tm.addTeacher("Pola", "Sobczyński", 1988, 9100.0, "present", g2Id);
            long t17ID = tm.addTeacher("Marcel", "Krawczyk", 1970, 9300.0, "absent", g1Id);
            long t18ID = tm.addTeacher("Lilia", "Zawadzki", 1995, 8700.0, "present", g2Id);
            long t19ID = tm.addTeacher("Nikodem", "Kołodziej", 1987, 9200.0, "present", g2Id);
            long t20ID = tm.addTeacher("Wiktoria", "Laskowski", 1992, 8900.0, "present", g2Id);
            long t21ID = tm.addTeacher("Fabian", "Bartoszewicz", 1983, 9000.0, "present", g2Id);
            long t22ID = tm.addTeacher("Liliana", "Nowakowski", 1975, 9500.0, "present", g1Id);
            long t23ID = tm.addTeacher("Leon", "Strzałkowski", 1986, 8800.0, "present", g1Id);
            long t24ID = tm.addTeacher("Marta", "Sikorski", 1991, 9100.0, "present", g4Id);
            long t25ID = tm.addTeacher("Oskar", "Jasiński", 1979, 9200.0, "present", g1Id);
            long t26ID = tm.addTeacher("Bianka", "Kaczmarczyk", 1981, 8900.0, "present", g5Id);
            long t27ID = tm.addTeacher("Kamil", "Malinowski", 1984, 8700.0, "present", g5Id);
            long t28ID = tm.addTeacher("Iga", "Czarnecki", 1993, 9300.0, "absent", g5Id);
            long t29ID = tm.addTeacher("Alan", "Jabłoński", 1974, 9400.0, "present", g1Id);
            long t30ID = tm.addTeacher("Roksana", "Tomaszewska", 1989, 9000.0, "present", g1Id);
        }
        finally
        {
            em.close();
            emf.close();
        }
    }
}