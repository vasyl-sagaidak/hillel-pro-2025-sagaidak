package lesson_30_JPA_and_Hibernate.homework.dao;

import lesson_30_JPA_and_Hibernate.homework.dto.Student;

import java.util.List;

public interface GenericDao <T, ID> {

    void save(T entry);

    T findById(ID id);

    T findByEmail(String email);

    List<T> findAll();

    Student update(T entity);

    boolean deleteById(ID id);
}
