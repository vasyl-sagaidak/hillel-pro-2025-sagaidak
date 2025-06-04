package org.example.springboot.service;

import org.example.springboot.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService {
    private final Map<Integer, Student> students = new HashMap<>();

    public Map<Integer, Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }
}
