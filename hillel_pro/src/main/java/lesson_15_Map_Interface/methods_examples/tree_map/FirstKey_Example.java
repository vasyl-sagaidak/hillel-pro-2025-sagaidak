package lesson_15_Map_Interface.methods_examples.tree_map;

import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.TreeMap;

// Метод firstKey() повертає перший (найнижчий) ключ в Map.
// Викидає NoSuchElementException - якщо Map порожній.
public class FirstKey_Example {
    public static void main(String[] args) {

        // Створюємо Map
        SortedMap<String,String> sortedMap = new TreeMap<>();

        // Make keys
        String key1 = "abc1";
        String key2 = "dvc3";
        String key3 = "sat2";
        String key4 = "est8";

        // Додаємо елементи
        sortedMap.put(key1, "orange");
        sortedMap.put(key2, "apricot");
        sortedMap.put(key3, "pepper");
        sortedMap.put(key4, null);

        // Виведення елементів
        System.out.println("1) Data: " + sortedMap);

        // Намагаємося отримати ключ
        String key = sortedMap.firstKey();
        System.out.println("Result 1 is " + key);

        // Очищуємо Map
        sortedMap.clear();
        // Виведення елементів
        System.out.println("2) Data: " + sortedMap);

        // Намагаємося отримати ключ.
        // Маємо обробити виняток.
        try {
            key = sortedMap.firstKey();
            System.out.println("Result 2 is " + key);
        } catch (NoSuchElementException e) {
            System.out.println("Result 2 is " + e.getMessage());
        }

    }
}
