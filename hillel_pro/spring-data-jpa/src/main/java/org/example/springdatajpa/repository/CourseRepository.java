package org.example.springdatajpa.repository;

import org.example.springdatajpa.dto.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
