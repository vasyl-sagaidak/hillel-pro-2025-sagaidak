package lesson_30_JPA_and_Hibernate.homework.dao;

import lesson_30_JPA_and_Hibernate.homework.dto.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDao implements GenericDao<Student, Long> {
    private final SessionFactory sessionFactory;

    public StudentDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Student student) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(student);
            transaction.commit();
        }
    }

    @Override
    public Student findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Student.class, id);
        }
    }

    @Override
    public Student findByEmail(String email) {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery(
                    "FROM lesson_30_JPA_and_Hibernate.homework.dto.Student s WHERE s.email = :email",
                            Student.class)
                    .setParameter("email", email)
                    .uniqueResult();
        }
    }

    @Override
    public List<Student> findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Student", Student.class).list();
        }
    }

    @Override
    public Student update(Student student) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Student merged = session.merge(student);
            transaction.commit();
            return merged;
        }
    }

    @Override
    public boolean deleteById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Student student = session.get(Student.class, id);
            if (student != null) {
                session.remove(student);
                transaction.commit();
                return true;
            }
            transaction.rollback();
            return false;
        }
    }
}
