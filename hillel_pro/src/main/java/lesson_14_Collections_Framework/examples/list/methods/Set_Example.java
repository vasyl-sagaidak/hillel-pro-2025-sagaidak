package lesson_14_Collections_Framework.examples.list.methods;

import java.util.ArrayList;
import java.util.List;

// Метод set(int index, E element) замінює
// елемент у вказаній позиції (індексу) в списку
// вказаним елементом.
public class Set_Example {
    public static void main(String[] args) {

        // Створення списку через конструктор ArrayList
        List<Integer> list = new ArrayList<>();
        // Додавання елементів до List
        list.add(23);
        list.add(17);
        list.add(35);
        list.add(8);
        // Виведення елементів
        System.out.println("1) Data: " + list);

        // Заміна елементу за індексом
        list.set(2, 49);
        // Виведення елементів
        System.out.println("2) Data: " + list);

        // Заміна елементу за індексом, якого немає.
        // Маємо обробити виняток.
        try {
            list.set(9, 56);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        // Виведення елементів
        System.out.println("3) Data: " + list);
    }
}
