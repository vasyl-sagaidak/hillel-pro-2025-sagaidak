package lesson_14_Collections_Framework.examples.list.methods;

import java.util.ArrayList;
import java.util.List;

// Метод removeAll(Collection<?> c) видаляє
// зі списку всі його елементи, які містяться
// у вказаній колекції.
public class RemoveAll_Example {
    public static void main(String[] args) {

        // Створення списку 1 через конструктор ArrayList
        List<String> list1 = new ArrayList<>();
        // Додавання елементів до списку 1
        list1.add("orange");
        list1.add("banana");
        list1.add("mango");
        list1.add("kiwi");
        list1.add("apple");
        // Виведення елементів списку 1
        System.out.println("1) Data: " + list1);

        // Створення списку 2 через конструктор ArrayList
        List<String> list2 = new ArrayList<>();
        // Додавання елементів до списку 2
        list2.add("banana");
        list2.add("kiwi");
        // Виведення елементів списку 2
        System.out.println("2) Data: " + list2);

        // Видалення елементів списку 1 за списком 2
        list1.removeAll(list2);
        // Виведення елементів оновленого списку 1
        System.out.println("3) Data: " + list1);

    }
}
