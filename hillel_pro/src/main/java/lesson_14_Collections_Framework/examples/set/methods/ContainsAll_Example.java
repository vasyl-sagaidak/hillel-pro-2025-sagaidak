package lesson_14_Collections_Framework.examples.set.methods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Метод containsAll(Collection<?> c) повертає true,
// якщо набір містить усі елементи вказаної колекції.
// Якщо набір містить вказаний набір, цей метод повертає true,
// якщо він є підмножиною цього набору.
public class ContainsAll_Example {

    public static void main(String[] args) {
        // Створення набору 1
        Set<String> set1 = new HashSet<>();
        // Додавання елементів до набору
        set1.add("orange");
        set1.add("banana");
        set1.add("kiwi");
        set1.add("apple");
        // Виведення елементів
        System.out.println("1) Data: " + set1);

        // Створення списку
        List<String> list = new ArrayList<>();
        // Додавання елементів до списку
        list.add("orange");
        list.add("kiwi");
        // Виведення елементів
        System.out.println("2) Data: " + list);

        // Визначення чи містить набір 1 елементи,
        // які є в списку
        if (set1.containsAll(list)) {
            System.out.println("Data contain " + list);
        } else {
            System.out.println("Data do not contain " + list);
        }

        // Створення набору 2
        Set<String> set2 = new HashSet<>();
        // Додавання елементів до набору
        set2.add("orange");
        set2.add("banana");
        set2.add("kiwi");
        set2.add("apple");
        // Виведення елементів
        System.out.println("3) Data: " + set2);

        // Створення набору 3
        Set<String> set3 = new HashSet<>();
        // Додавання елементів до набору
        set3.add("orange");
        set3.add("kiwi");
        // Виведення елементів
        System.out.println("4) Data: " + set3);

        // Визначення чи містить набір 2 елементи,
        // які є в наборі 3
        if (set2.containsAll(set3)) {
            System.out.println("Data contain " + set3);
        } else {
            System.out.println("Data do not contain " + set3);
        }
    }
}
