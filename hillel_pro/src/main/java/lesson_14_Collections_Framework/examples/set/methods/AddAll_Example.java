package lesson_14_Collections_Framework.examples.set.methods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Метод addAll(Collection<? extends E> c) додає всі елементи
// певної колекції до набору, якщо вони ще не присутні.
// Якщо додається набір до набору, операція addAll
// фактично змінює набір таким чином, що його значення
// є об’єднанням двох наборів.
public class AddAll_Example {

    public static void main(String[] args) {

        // Створення набору 1
        Set<String> set1 = new HashSet<>();
        // Додавання елементів до набору
        set1.add("orange-s1");
        set1.add("banana-s1");
        set1.add("kiwi-s1");
        // Виведення елементів
        System.out.println("1) Data: " + set1);

        // Створення списку
        List<String> list = new ArrayList<>();
        // Додавання елементів до списку
        list.add("orange-l");
        list.add("banana-l");
        // Виведення елементів
        System.out.println("2) Data: " + list);

        // Додавання списку до набору 1
        set1.addAll(list);
        // Виведення елементів
        System.out.println("3) Data: " + set1);

        // Створення набору 2
        Set<String> set2 = new HashSet<>();
        // Додавання елементів до набору
        set2.add("orange-s2");
        set2.add("banana-s2");
        set2.add("kiwi-s2");
        // Виведення елементів
        System.out.println("4) Data: " + set2);

        // Створення набору 3
        Set<String> set3 = new HashSet<>();
        // Додавання елементів до набору
        set3.add("orange-s3");
        set3.add("banana-s3");
        // Виведення елементів
        System.out.println("5) Data: " + set3);

        // Додавання набору 3 до набору 2
        set2.addAll(set3);
        // Виведення елементів
        System.out.println("6) Data: " + set2);
    }
}
