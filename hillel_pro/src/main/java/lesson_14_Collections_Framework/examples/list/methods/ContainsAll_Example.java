package lesson_14_Collections_Framework.examples.list.methods;

import java.util.List;
import java.util.ArrayList;

// Метод containsAll(Collection<?> c)
// повертає true, якщо один список містить
// усі елементи іншої колекції.
public class ContainsAll_Example {

    public static void main(String[] args) {

        // Створення List через конструктор ArrayList
        List<String> list1 = new ArrayList<>();
        // Додавання елементів до List
        list1.add("orange");
        list1.add("banana");
        list1.add("kiwi");
        list1.add("apple");
        list1.add("mango");
        list1.add("grape");
        // Виведення списку 1.
        System.out.println("1) Data: " + list1);

        // Створення List через конструктор ArrayList
        List<String> list2 = new ArrayList<>();
        // Додавання елементів до List
        list2.add("orange");
        list2.add("kiwi");
        list2.add("grape");
        // Виведення списку 2.
        System.out.println("2) Data: " + list2);

        // Визначення чи містить список 1 елементи списку 2.
        if (list1.containsAll(list2)) {
            System.out.println("List contains list 2");
        } else {
            System.out.println("List does not contain list 2");
        }
    }
}
