package lesson_16_Functional_Programming.homework;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class HomeWork_16_Main {
    public static void main(String[] args) {
// 1) Створіть функціональний інтерфейс MathOperation,
//    який має один метод int operate(int a, int b).

        // FunctionalInterfaces: MathOperation, StringManipulator are SUCCESSFULLY created!!!
        // Classes: RandomNumberGenerator, StringListProcessor are SUCCESSFULLY created!!!

// 2) Використовуючи анонімний клас, створіть об'єкт інтерфейсу MathOperation
//    який виконує операцію додавання.

        MathOperation mathOperation = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        UIOut.getOutput(mathOperation.operate(5, 3));

// 3) Створіть лямбда-вираз, який реалізує функціональний інтерфейс StringManipulator
//    і перетворює вхідний рядок в верхній регістр.

        StringManipulator stringManipulator = (s) -> s.toUpperCase();

        UIOut.getOutput(stringManipulator.toUppercase("hillel java pro"));

// 4) Створіть клас StringListProcessor, який має статичний метод int countUppercase(String s),
//    що повертає кількість великих літер у рядку.

        UIOut.getOutput(StringListProcessor
                .countUpperCase(" p P _aa R a@a$ D ii G -m M #@^& "));

// 5) Використайте посилання на методи, щоб передати метод countUppercase як
//    аргумент функції Function<String, Integer>.

        Function<String, Integer> function = StringListProcessor::countUpperCase;

        UIOut.getOutput("Capital letters in word=VeRiTaS: "
                + function.apply("VeRiTaS"));

// 6) Створіть клас RandomNumberGenerator, який має статичний метод
//    int generateRandomNumber(int min, int max), що повертає випадкове ціле число
//    в заданому діапазоні.
        UIOut.getOutput(RandomNumberGenerator.generateRandomNumber(1,100));

// 7) Використайте інтерфейс Supplier<T> для створення постачальника,
//    який буде генерувати випадкове число від 1 до 100.
        Supplier<Integer> supplier = () -> new Random().nextInt(100);

        UIOut.getOutput(supplier.get());
    }
}
