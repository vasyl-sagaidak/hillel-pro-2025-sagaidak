package lesson_14_Collections_Framework.examples.list.methods.linkedList_unique;

import java.util.LinkedList;

// !!! - Данный метод существует в интерфейсе Deque либо в LinkedList,
// так что, что бы его использовать нужно привести тип переменной к LinkedList.

// Метод addLast(E e) додає вказаний елемент
// у кінець списку.
public class AddLast_LinkedLIst_Example {
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
        // Додавання елементу
        list.addLast("mango");
        // Виведення елементів
        System.out.println("2) Data: " + list);
    }
}
