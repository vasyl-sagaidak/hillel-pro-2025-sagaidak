package lesson_14_Collections_Framework.examples.set.methods;

import java.util.HashSet;
import java.util.Set;

// Метод clear() видаляє всі елементи
// з набору (очищає набір).
public class Clear_Example {

    public static void main(String[] args) {
        // Створення набору через конструктор HashSet
        Set<Integer> set = new HashSet<>();
        // Додавання елементів до набору
        set.add(23);
        set.add(17);
        set.add(35);
        set.add(8);
        // Виведення елементів
        System.out.println("1) Data: " + set);
        // Очищення набору
        set.clear();
        // Виведення набору після очищення.
        // Тобто об'єкт набору становиться просто порожнім,
        // але не видаляється.
        System.out.println("2) Data: " + set);
    }
}
