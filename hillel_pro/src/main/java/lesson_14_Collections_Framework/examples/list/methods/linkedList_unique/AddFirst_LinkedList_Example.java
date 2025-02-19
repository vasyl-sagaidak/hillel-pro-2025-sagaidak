package lesson_14_Collections_Framework.examples.list.methods.linkedList_unique;

import java.util.LinkedList;

// !!! - Данный метод существует в интерфейсе Deque либо в LinkedList,
// так что, что бы его использовать нужно привести тип переменной к LinkedList.

// Метод addFirst(E e) вставляє вказаний елемент
// на початок списку.
public class AddFirst_LinkedList_Example {
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
        // Вставлення елементу
        list.addFirst("mango");
        // Виведення елементів
        System.out.println("2) Data: " + list);
    }
}
