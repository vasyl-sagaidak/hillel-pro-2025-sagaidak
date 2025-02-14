package lesson_14_Collections_Framework.examples.set;

import java.util.HashSet;
import java.util.Set;

// Ітерація (перебирання) елементів набору
public class Set_Iteration_Example {
    public static void main(String[] args) {

        // Створення набору
        Set<String> set = new HashSet<>();
        // Додавання елементів
        set.add("orange");
        set.add("banana");
        set.add("kiwi");
        set.add("apple");

        // Виведення всіх елементів через цикл for-each.
        System.out.println("\nA. Data:");
        for (String item : set)
            System.out.println(item);

        // Виведення всіх елементів через цикл for-each,
        // з нумерацією елементів.
        int count = 0; // <- Лічильник
        System.out.println("\nB. Data:");
        for (String item : set) {
            count++;
            System.out.println(count + ") " + item);
        }

        // Метод forEach(Consumer<? super E> action)
        // виконує задану дію для кожного елемента списку,
        // доки всі елементи не будуть оброблені або дія
        // не викличе виняткову ситуацію.
        // Тут - виведення всіх елементів набору.
        System.out.println("\nC. Data:");
        set.forEach(
                // Лямбда-вираз, який стосується галузі
                // функціонального програмування (розглядається окремо).
                item -> System.out.println("Item is " + item)
        );

    }
}
