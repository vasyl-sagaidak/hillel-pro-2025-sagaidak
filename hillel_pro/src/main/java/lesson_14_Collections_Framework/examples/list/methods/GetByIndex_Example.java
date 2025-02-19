package lesson_14_Collections_Framework.examples.list.methods;

import java.util.ArrayList;
import java.util.List;

// Метод get(int index) повертає елемент
// у вказаній позиції (індексу) в списку.
// Викидає IndexOutOfBoundsException - якщо
// індекс виходить за межі діапазону індексів
// в списку.
public class GetByIndex_Example {
    public static void main(String[] args) {

        // Створення List через конструктор ArrayList
        List<String> list = new ArrayList<>();
        // Додавання елементів до списку
        list.add("orange"); // <- Index 0
        list.add("banana"); // <- Index 1
        list.add("kiwi"); // <- Index 2
        list.add("apple"); // <- Index 3

        // Виведення елементів
        System.out.println("Data: " + list);
        // Отримання елементу з певної позиції в списку
        String item = list.get(2);
        // Виведення елементу
        System.out.println("Result is " + item);

        // Намагаємося отримати елемент за індексом, який
        // є за межами діапазону індексів.
        // Маємо обробити виняток.
        try {
            item = list.get(9);
            System.out.println("Result is " + item);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No data!");
        }
    }
}
