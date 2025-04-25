package lesson_30_JPA_and_Hibernate.homework.dao;

import jakarta.persistence.EntityManager;
import lesson_30_JPA_and_Hibernate.homework.dto.Student;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractGenericDao<T, ID> implements GenericDao<T, ID> {
    protected final EntityManager entityManager;
    private final Class<T> entityClass;

    public AbstractGenericDao(EntityManager entityManager, Class<T> entityClass) {
        this.entityManager = entityManager;
        this.entityClass = entityClass;
    }

    @Override
    public void save(T entry) {

    }

    @Override
    public T findById(ID id) {
        return null;
    }

    @Override
    public T findByEmail(String email) {
        return null;
    }

    @Override
    public List<T> findAll() {
        List<T> entities = new ArrayList<>();
        return List.of();
    }

    @Override
    public Student update(T entity) {
        return null;
    }

    @Override
    public boolean deleteById(ID id) {
        return false;
    }
}
