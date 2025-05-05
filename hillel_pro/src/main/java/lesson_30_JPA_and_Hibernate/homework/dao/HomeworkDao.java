package lesson_30_JPA_and_Hibernate.homework.dao;

import jakarta.persistence.EntityManagerFactory;
import lesson_30_JPA_and_Hibernate.homework.dto.Homework;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class HomeworkDao implements GenericDao<Homework, Long>{
    private final SessionFactory sessionFactory;

    public HomeworkDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;

    }

    @Override
    public void save(Homework homework) {
        try(Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(homework);
            transaction.commit();
        }
    }

    @Override
    public Homework findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Homework.class, id);
        }
    }

    @Override
    public Homework findByEmail(String email) {
        throw new UnsupportedOperationException("Homework does not support lookup by email.");
    }

    @Override
    public List<Homework> findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Homework", Homework.class).list();
        }
    }

    @Override
    public Homework update(Homework homework) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Homework merged = (Homework) session.merge(homework);
            transaction.commit();
            return merged;
        }
    }

    @Override
    public boolean deleteById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Homework homework = session.get(Homework.class, id);
            if (homework != null) {
                session.remove(homework);
                transaction.commit();
                return true;
            }
            transaction.rollback();
            return false;
        }
    }
}
