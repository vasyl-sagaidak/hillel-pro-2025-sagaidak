package lesson_24_gof_patterns_01.livecoding_patterns.creational.prototype;

import lesson_24_gof_patterns_01.livecoding_patterns.creational.prototype.model.Employee;
/*
PROTOTYPE(ПРОТОТИП):
           -> Определяет несколько видов обьектов, чтобы при создании использовать
              обьект-прототип и создает новые обьекты, копируя прототип.
 */

public class Prototype_Pattern_Main {
    public static void main(String[] args) {
        Employee original = new Employee("Bob", "Java");
        Employee clone1 = original.clone();

        System.out.println("Orig person: " + original);
        System.out.println("Cloned person: " + clone1);

        clone1.setName("Alice");

        System.out.println("Cloned person, changed name: " + clone1);
    }
}
