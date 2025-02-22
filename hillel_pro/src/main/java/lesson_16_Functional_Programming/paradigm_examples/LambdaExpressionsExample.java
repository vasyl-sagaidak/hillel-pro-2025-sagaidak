package lesson_16_Functional_Programming.paradigm_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressionsExample {
    public static void main(String[] args) {
        // Створення списку чисел
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Приклад використання лямбда-виразу для фільтрації парних чисел
        List<Integer> evenNumbers = filter(numbers, n -> n % 2 == 0);

        System.out.println("Парні числа: " + evenNumbers);
    }

    // Функція для фільтрації списку чисел за заданим умовою предикатом
    public static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        // Створення нового списку для результатів
        List<Integer> result = new ArrayList<>();

        // Фільтрація чисел за допомогою переданого предиката
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }

        return result;
    }
}
