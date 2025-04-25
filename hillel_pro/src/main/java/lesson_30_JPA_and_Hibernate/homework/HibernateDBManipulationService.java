package lesson_30_JPA_and_Hibernate.homework;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDBManipulationService {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate_homework.cfg.xml")
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
    }
}
