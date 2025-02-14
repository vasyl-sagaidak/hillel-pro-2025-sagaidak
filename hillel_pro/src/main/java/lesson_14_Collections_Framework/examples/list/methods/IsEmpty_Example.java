package lesson_14_Collections_Framework.examples.list.methods;

import java.util.ArrayList;
import java.util.List;

// Метод isEmpty()
// повертає true, якщо список не містить елементів.
public class IsEmpty_Example {
    public static void main(String[] args) {

        // Створення List через конструктор ArrayList
        List<String> list = new ArrayList<>();

        // Виведення порожнього списку
        System.out.println("1) Data: " + list);

        // Визначення чи містить список елементи.
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is full");
        }

        // Додавання елементів до списку
        list.add("orange");
        list.add("banana");
        list.add("kiwi");
        list.add("apple");

        // Виведення повного списку
        System.out.println("2) Data: " + list);

        // Визначення чи містить список елементи.
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is full");
        }
    }
}
