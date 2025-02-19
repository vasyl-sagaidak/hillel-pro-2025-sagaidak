package lesson_14_Collections_Framework.examples.list.methods.linkedList_unique;

import java.util.LinkedList;
import java.util.List;

// !!! - Данный метод существует в интерфейсе Deque либо в LinkedList,
// так что, что бы его использовать нужно привести тип переменной к LinkedList.

// Метод getLast() повертає останній елемент списку.

public class GetLast_LinkedList_Example {
    public static void main(String[] args) {
        // Створення списку через конструктор LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        // Додавання елементів до списку
        list.add(25);
        list.add(17);
        list.add(98);
        list.add(5);
        // Виведення елементів
        System.out.println("Data: " + list);
        // Повернення елементу
        Integer item = list.getLast();
        // Виведення елементу
        System.out.println("Item: " + item);
    }
}
