package lesson_16_Functional_Programming.paradigm_examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // Створення списку чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Приклад використання операції map для подвоєння кожного числа
        List<Integer> doubledNumbers = numbers.stream()
                .map(num -> num * 2) // Функція map: кожне число множиться на 2
                .collect(Collectors.toList());

        System.out.println("Подвоєні числа: " + doubledNumbers);

        // Приклад використання операції filter для відбору парних чисел
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0) // Функція filter: відбирає парні числа
                .collect(Collectors.toList());

        System.out.println("Парні числа: " + evenNumbers);
    }
}
