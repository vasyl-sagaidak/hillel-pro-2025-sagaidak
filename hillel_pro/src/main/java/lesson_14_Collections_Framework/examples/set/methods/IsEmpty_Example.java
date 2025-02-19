package lesson_14_Collections_Framework.examples.set.methods;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

// Метод isEmpty()
// повертає true, якщо набір не містить елементів.
public class IsEmpty_Example {
    public static void main(String[] args) {

        // Створення набору через конструктор HashSet
        Set<Integer> set = new HashSet<>();
        // Виведення порожнього набору
        System.out.println("1) Data: " + set);

        // Визначення чи містить набір елементи.
        if (set.isEmpty()) {
            System.out.println("Set is empty");
        } else {
            System.out.println("Set is full");
        }

        // Додавання елементів до набору
        set.add(23);
        set.add(17);
        set.add(35);
        set.add(8);
        // Виведення наповненого набору
        System.out.println("2) Data: " + set);

        // Визначення чи містить набір елементи.
        if (set.isEmpty()) {
            System.out.println("Set is empty");
        } else {
            System.out.println("Set is full");
        }

        LinkedList<String> lists = new LinkedList<>();
        lists.add("a");
        lists.add("b");
        lists.add("c");
        System.out.println(lists.getLast());
    }
}
