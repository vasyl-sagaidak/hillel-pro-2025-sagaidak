package lesson_30_JPA_and_Hibernate.classwork.dao;

import lesson_30_JPA_and_Hibernate.classwork.dto.Group;
import lesson_30_JPA_and_Hibernate.classwork.dto.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        try {
            // Вставляем данные в базу
            Group group = new Group("GOA MAFIA");
            Student student =
                new Student("Tristan",
                        "3030303030",
                        "Trance Fan",
                        group);

        session.beginTransaction();
        session.persist(group);
        session.persist(student);
        session.getTransaction().commit();

            // Вытаскиваем данные из базы
            List<Student> fromStudent =
                    session.createQuery("from Student", Student.class).getResultList();
             fromStudent.forEach(System.out::println);

            List<Group> groups = session.createQuery("from Group", Group.class).getResultList();
            groups.forEach(System.out::println);
        } finally {
            sessionFactory.close();
        }
    }
}
