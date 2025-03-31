package lesson_24_gof_patterns_01.livecoding.creational.prototype;

import lesson_24_gof_patterns_01.livecoding.creational.prototype.model.Employee;

public class PrototypeMain {
    public static void main(String[] args) {
        Employee original = new Employee("Bob", "Java");
        Employee clone1 = original.clone();

        System.out.println("Orig person: " + original);
        System.out.println("Cloned person: " + clone1);

        clone1.setName("Alice");

        System.out.println("Cloned person, changed name: " + clone1);
    }
}
