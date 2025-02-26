package lesson_16_Functional_Programming.paradigm_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class HigherOrderFunctionsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Виклик функції вищого порядку для фільтрації парних чисел
        List<Integer> evenNumbers = filter(numbers, n -> n % 2 == 0);

        System.out.println("Парні числа: " + evenNumbers);
    }

    // Функція вищого порядку для фільтрації списку чисел
    public static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        // Створюємо новий список для результатів
        List<Integer> result = new ArrayList<>();

        // Фільтруємо числа за допомогою переданого предиката
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }

        return result;
    }
}