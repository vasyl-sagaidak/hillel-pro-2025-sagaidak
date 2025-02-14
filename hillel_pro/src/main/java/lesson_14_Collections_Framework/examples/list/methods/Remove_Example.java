package lesson_14_Collections_Framework.examples.list.methods;

import java.util.ArrayList;
import java.util.List;

// Метод remove(int index) видаляє елемент
// у вказаній позиції (індексом) в списку.
// Викидає IndexOutOfBoundsException - якщо
// індекс виходить за межі діапазону індексів
// в списку.
// Метод remove(Object o) видаляє перше входження
// зазначеного елемента зі списку, якщо він присутній.
// Викидає NullPointerException - якщо вказаний елемент
// має значення null.
public class Remove_Example {
    public static void main(String[] args) {

        // Створення List через конструктор ArrayList
        List<String> list = new ArrayList<>();
        // Додавання елементів до списку
        list.add("orange");
        list.add("banana"); // <- Входження 1
        list.add("mango");
        list.add("kiwi");
        list.add(null);
        list.add("banana"); // <- Входження 2
        list.add("apple");
        // Виведення елементів
        System.out.println("1) Data: " + list);

        // Видалення за індексом
        list.remove(2);
        // Виведення елементів
        System.out.println("2) Data: " + list);

        // Видалення за першим входженням елементу
        list.remove("banana");
        // Виведення елементів
        System.out.println("3) Data: " + list);

        // Видалення за першим (воно ж і єдине) входженням елементу
        list.remove("orange");
        // Виведення елементів
        System.out.println("4) Data: " + list);

        // Видалення елементу, якого немає.
        // Нічого не відбувається.
        list.remove("grape");
        // Виведення елементів
        System.out.println("5) Data: " + list);

        // Видалення елементу, значення якого null.
        list.remove(null);
        // Виведення елементів
        System.out.println("6) Data: " + list);

        // Видалення за індексом, якого немає.
        // Маємо обробити виняток.
        try {
            list.remove(9);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        // Виведення елементів
        System.out.println("7) Data: " + list);
    }
}
