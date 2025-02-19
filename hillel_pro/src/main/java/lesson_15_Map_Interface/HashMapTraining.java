package lesson_15_Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapTraining {
    public static void main(String[] args) {
        Map<Student2, Double> map = new HashMap<>();
        Student2 st1 = new Student2("Zaur", "Tregulov", 3);
        Student2 st2 = new Student2("Mariya", "Ivanova", 1);
        Student2 st3 = new Student2("Sergey", "Petrov", 4);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        System.out.println(map);
        System.out.println(map.containsKey(st1));
        System.out.println(st1.hashCode());

    }
}

final class Student2 {
    private final String name;
    private final String surname;
    private final int course;

    public Student2(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object student) {
        if (student == this) {
            return true;
        }
        if (student == null) {
            return false;
        }
        if (student.getClass().equals(Student2.class)) {
            Student2 current = (Student2) student;
            return current.name.equals(this.name)
                    && current.surname.equals(this.surname)
                    && current.course == this.course;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int hashCode = 17;
        hashCode = 31 * hashCode + (name != null ? name.hashCode() : 0);
        hashCode = 31 * hashCode + (surname != null ? surname.hashCode() : 0);
        hashCode = 31 * hashCode + course;
        return hashCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }
}
