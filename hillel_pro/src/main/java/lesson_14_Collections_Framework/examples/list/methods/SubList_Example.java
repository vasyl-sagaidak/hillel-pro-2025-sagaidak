package lesson_14_Collections_Framework.examples.list.methods;

import java.util.ArrayList;
import java.util.List;

// Метод subList(int fromIndex, int toIndex)
// повертає частину списку між вказаним fromIndex, включно,
// та toIndex, виключно.
// Якщо fromIndex та toIndex рівні, повернутий список порожній.
public class SubList_Example {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(17);
        list.add(35);
        list.add(8);
        list.add(39);

        // Виведення всіх елементів
        System.out.println("1) Data: " + list);

        // Виведення частини елементів.
        // fromIndex є 1, toIndex є 3.
        System.out.println("2) Data: " + list.subList(1, 3));

        // Виведення порожнього списку,
        // оскільки fromIndex та toIndex рівні.
        System.out.println("3) Data: " + list.subList(2, 2));

    }
}
