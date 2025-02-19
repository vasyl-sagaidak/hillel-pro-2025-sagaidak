package lesson_15_Map_Interface.hashCodeEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EqualsHashCodeMain {
    public static void main(String[] args) {

        // Вспоминаем переопределение equals и hashcode.
        // Если вы переопределили Equals, то переопределите и hashCode,
        // Эти два метода всегда работают в паре.

        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Vasyl", "Sagaidak", 4);
        Student st3 = new Student("Rodion", "Batiushkov", 5);
        map.put(st1,7.5);
        map.put(st2,8.7);
        map.put(st3, 9.2);

        System.out.println(map);

        Student st4 = new Student("Zaur", "Tregulov", 3);
        Student st5 = new Student("Ihor", "Sidorov", 6);

//        boolean result = map.containsKey(st4);
//        System.out.println("result=" + result);
        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());
        System.out.println(st5.hashCode());

        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
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
        if (student.getClass().equals(Student.class)) {
            Student current = (Student) student;
            return current.name.equals(this.name)
                    && current.surname.equals(this.surname)
                    && current.course == this.course;
        }
        return false;
    }

    // 1) Результат выполнения метода hashCode для одного и того же обьекта должен быть одинаковым.
    // 2) Если, согласно методу equals, два обьекта равны, то и hashcode данных обьектов обязательно
    //    должен быть одинаковым.
    // 3) Если, согласно методу equals, два обьекта НЕ равны, то hashCode данных обьектов НЕ обязательно
    //    должен быть разным.
    // 4) Ситуация, когда результат метода hashcode для разных обьектов одинаков, называется коллизией.
    //    Чем ее меньше, тем лучше.

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
