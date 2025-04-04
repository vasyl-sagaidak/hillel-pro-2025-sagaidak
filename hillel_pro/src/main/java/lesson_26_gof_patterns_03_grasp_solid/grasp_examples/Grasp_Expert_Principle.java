package lesson_26_gof_patterns_03_grasp_solid.grasp_examples;

/*
В этом примере класс StudentService использует метод printStudentInfo, требующий информацию о студенте для
печати его данных. Поскольку класс Student располагает всей необходимой информацией о студенте, он является
экспертом в этом случае. Класс StudentService использует данные с объекта студента напрямую, соблюдая
принцип Expert.
 */

// Класc, содержащий информацию о студенте
class Student {
    private String name;
    private int age;

    // Конструктор и методы доступа к полям класса

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Класс, который содержит метод, который использует информацию о студенте
class StudentService {
    public void printStudentInfo(Student student) {
        System.out.println("Ім'я студента: " + student.getName());
        System.out.println("Вік студента: " + student.getAge());
    }
}

public class Grasp_Expert_Principle {
    public static void main(String[] args) {
        // Создание обьекта класса Student с информацией о студенте
        Student student = new Student("Іван", 20);

        // Создание обьекта класса StudentService
        StudentService studentService = new StudentService();

        // Вызов метода для печати информации о студенте
        studentService.printStudentInfo(student);
    }
}


