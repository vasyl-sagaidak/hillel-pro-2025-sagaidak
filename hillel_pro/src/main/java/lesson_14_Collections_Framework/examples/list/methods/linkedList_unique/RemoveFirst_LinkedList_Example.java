package lesson_14_Collections_Framework.examples.list.methods.linkedList_unique;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

// !!! - Данный метод существует в интерфейсе Deque либо в LinkedList,
// так что, что бы его использовать нужно привести тип переменной к LinkedList.

// Метод removeFirst() вилучає та повертає
// перший елемент із списку.
// Викидає NoSuchElementException - якщо список
// порожній.
public class RemoveFirst_LinkedList_Example {
    public static void main(String[] args) {

        // Створення списку через конструктор LinkedList
        LinkedList<String> list = new LinkedList<>();
        // Додавання елементів до списку
        list.add("orange");
        list.add("banana");
        list.add("kiwi");
        list.add("apple");
        // Виведення елементів
        System.out.println("1) Data: " + list);

        // Вилучаємо та повертаємо елемент із списку.
        String item = list.removeFirst();
        // Виведення елементу
        System.out.println("Item: " + item);

        // Виведення елементів
        System.out.println("2) Data: " + list);

        // Очищуємо список.
        list.clear();
        // Список - порожній.
        System.out.println("3) Data: " + list);

        // Намагаємося отримати елемент із порожнього списку.
        // Одночасно обробляємо виняток.
        try {
            item = list.removeFirst();
            System.out.println("Item: " + item);
        } catch (NoSuchElementException e) {
            System.out.println("No data!");
        }
    }
}
