package examples.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo {

    void testStudents(ArrayList<Student> students, StudentChecks sc) {
        for (Student s : students) {
            if (sc.checkStudent(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m', 22, 3,8.3);
        Student st2 = new Student("Nikolay",'m', 28, 2,6.4);
        Student st3 = new Student("Elena",'f', 19, 1,8.9);
        Student st4 = new Student("Petr",'m', 35, 4,7);
        Student st5 = new Student("Mariya",'f', 23, 3,9.1);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

       StudentInfo info = new StudentInfo();
//        Collections.sort(students, new Comparator<Student>() {
//
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course - s2.course;
//            }
//        });
//        System.out.println(students);

        Collections.sort(students, (stud1,stud2) -> stud1.course - stud2.course);
        System.out.println(students);

//
//        System.out.println("-------------------------");
//        info.testStudents(students, (Student p) -> {
//            return p.avgGrade > 8.0;
//        });
//        System.out.println("-------------------------");
//        info.testStudents(students, p -> p.age < 30);
//        System.out.println("-------------------------");
//        info.testStudents(students, (Student p) -> {
//            return p.age > 20 && p.avgGrade < 9.3 && p.sex == 'f';
//        });
//        System.out.println("-------------------------");
//
//        // Пример пункта 6
//        info.testStudents(students, p -> {
//            System.out.println("Hello");
//            return p.age > 8.0;
//        });
//
//        StudentChecks sc = (Student p) -> {return p.avgGrade > 8;};
    }
}

// Функциональный интерфейс, имеющий только один абстрактный метод.
interface StudentChecks {
    boolean checkStudent(Student s);
}
