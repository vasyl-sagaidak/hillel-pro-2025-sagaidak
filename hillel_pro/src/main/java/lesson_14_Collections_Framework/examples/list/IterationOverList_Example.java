package lesson_14_Collections_Framework.examples.list;

import java.util.ArrayList;
import java.util.List;

// Ітерація (перебирання) елементів списку
public class IterationOverList_Example {
    public static void main(String[] args) {

        // Створення списку через конструктор ArrayList
        List<String> list = new ArrayList<>();
        // Додавання String елементів до списку
        list.add("orange");
        list.add("banana");
        list.add("kiwi");
        list.add("banana"); // <- Дублікат дозволено
        list.add("apple");

        // Виведення елементів через цикл for.
        // Метод size() повертає кількість елементів
        // у списку.
        // Метод get() повертає елемент у вказаній
        // позиції (індексі) в списку.
        System.out.println("\nA. Data:");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        // Виведення всіх елементів через цикл for-each.
        System.out.println("\nB. Data:");
        for (String item : list)
            System.out.println(item);

        // Виведення всіх елементів через цикл for-each,
        // з нумерацією елементів.
        int count = 0; // <- Лічильник
        System.out.println("\nC. Data:");
        for (String item : list) {
            count++;
            System.out.println(count + ") " + item);
        }

        // Метод forEach(Consumer<? super E> action)
        // виконує задану дію для кожного елемента списку,
        // доки всі елементи не будуть оброблені або дія
        // не викличе виняткову ситуацію.
        // Тут - виведення всіх елементів списку.
        System.out.println("\nD. Data:");
        list.forEach(
                // Лямбда-вираз, який стосується галузі
                // функціонального програмування (розглядається окремо).
                item -> System.out.println("Item is " + item)
        );

    }
}
