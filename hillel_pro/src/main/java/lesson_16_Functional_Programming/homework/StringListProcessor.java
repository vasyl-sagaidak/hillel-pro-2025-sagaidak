package lesson_16_Functional_Programming.homework;

public class StringListProcessor {
    /*

    4) Створіть клас StringListProcessor, який має статичний метод int countUppercase(String s),
       що повертає кількість великих літер у рядку.

    5) Використайте посилання на методи, щоб передати метод countUppercase як
       аргумент функції Function<String, Integer>.
     */
    static int countUpperCase(String s) {
        return s.replaceAll("[^A-Z]", "").length();
    }
}
