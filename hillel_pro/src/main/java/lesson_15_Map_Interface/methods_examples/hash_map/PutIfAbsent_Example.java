package lesson_15_Map_Interface.methods_examples.hash_map;

import java.util.HashMap;
import java.util.Map;

// Метод putIfAbsent(K key, V value).
// Якщо вказаний ключ ще не пов’язано зі значенням
// (або зіставлено з null), він пов’язує його з заданим
// значенням і повертає null, інакше повертає поточне значення.
public class PutIfAbsent_Example {

    public static void main(String[] args) {
        // Створюємо Map
        Map<Integer, String> map = new HashMap<>();
        // Додаємо елементи
        map.put(322, "orange");
        map.put(124, "apricot");
        map.put(363, "kiwi");
        map.put(407, null); // <- null значення
        map.put(807, "mango");
        // Виведення елементів
        System.out.println("1) Data: " + map);

        // Додаємо елементи
        // Такий ключ вже має значення
        map.putIfAbsent(322, "cherry");
        // Такий ключ має значення null
        map.put(407, "cherry");
        // Такого елемента немає
        map.putIfAbsent(552, "grape");
        // Виведення елементів
        System.out.println("2) Data: " + map);
    }
}
