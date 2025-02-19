package lesson_14_Collections_Framework.examples.set.methods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Метод retainAll(Collection<?> c) залишає лише ті елементи набору,
// які містяться у вказаній колекції.
// Тобто, видаляє з цього набору всі його елементи, які не містяться
// у вказаній колекції.
// Якщо елементи для залишення, зазначені у вказаному наборі, то ця
// операція фактично змінює набір таким чином, що його значення є перетином
// двох наборів.
public class RetainAll_Example {

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

        // Залишення в наборі 1 елементів, які є в списку
        set1.retainAll(list);
        // Виведення елементів
        System.out.println("3) Data: " + set1);

        // Створення набору 2
        Set<String> set2 = new HashSet<>();
        // Додавання елементів до набору
        set2.add("orange");
        set2.add("banana");
        set2.add("kiwi");
        set2.add("apple");
        // Виведення елементів
        System.out.println("4) Data: " + set2);

        // Створення набору 3
        Set<String> set3 = new HashSet<>();
        // Додавання елементів до набору
        set3.add("orange");
        set3.add("kiwi");
        // Виведення елементів
        System.out.println("5) Data: " + set3);

        // Залишення в наборі 2 елементів, які є в наборі 3
        set2.retainAll(set3);
        // Виведення елементів
        System.out.println("6) Data: " + set2);
    }
}
