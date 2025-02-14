package lesson_14_Collections_Framework.examples.list.methods;

import java.util.*;

// Метод contains(Object o)
// повертає true, якщо список містить
// вказаний елемент.
public class Contains_Example {
    public static void main(String[] args) {

        // Створення List через конструктор ArrayList
        List<Integer> list = new ArrayList<>();
        // Додавання елементів до List
        list.add(23);
        list.add(17);
        list.add(5);
        list.add(38);

        // Виведення елементів
        System.out.println("Data: " + list);

        // Визначення чи містить список певний елемент.
        Integer item = 17;
        if (list.contains(item)) {
            System.out.println("List contains " + item);
        } else {
            System.out.println("List does not contain " + item);
        }
    }
}
