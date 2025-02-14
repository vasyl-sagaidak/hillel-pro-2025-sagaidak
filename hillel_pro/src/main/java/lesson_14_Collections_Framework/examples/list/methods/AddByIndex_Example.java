package lesson_14_Collections_Framework.examples.list.methods;

import java.util.ArrayList;
import java.util.List;

// Метод add(int index, E element) всталяє елемент
// у вказану позицію (індекс) в списку.
public class AddByIndex_Example {
    public static void main(String[] args) {
        // Створення List через конструктор ArrayList
        List<String> list = new ArrayList<>();
        // Додавання елементів до List
        list.add("orange");
        list.add("banana");
        list.add("kiwi");
        // Додавання до певної позиції
        list.add(1, "mango");
        list.add("apple");
        // Виведення елементів
        System.out.println("Data: " + list);
    }
}
