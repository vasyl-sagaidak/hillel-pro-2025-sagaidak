package lesson_16_Functional_Programming.paradigm_examples;

import java.util.function.IntUnaryOperator;

public class ClosureExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // Создание замыкания которое прибавляет к х значение у
        IntUnaryOperator closure = value -> value + y;

        int result = closure.applyAsInt(x);
        System.out.println("Результат " + result);
    }
}
