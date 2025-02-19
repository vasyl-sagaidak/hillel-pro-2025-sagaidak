package lesson_14_Collections_Framework.examples.set.methods;

import java.util.HashSet;
import java.util.Set;

// Метод contains(Object o) повертає true,
// якщо набір містить вказаний елемент.
public class Contains_Example {

    public static void main(String[] args) {
        // Створення набору через конструктор HashSet
        Set<String> set = new HashSet<>();
        // Додавання елементів до набору
        set.add("orange");
        set.add("banana");
        set.add("kiwi");
        set.add("apple");
        // Виведення елементів
        System.out.println("Data: " + set);

        // Визначення чи містить набір певний елемент.
        String item = "kiwi";
        if (set.contains(item)) {
            System.out.println("Data contain " + item);
        } else {
            System.out.println("Data do not contain " + item);
        }
    }
}
