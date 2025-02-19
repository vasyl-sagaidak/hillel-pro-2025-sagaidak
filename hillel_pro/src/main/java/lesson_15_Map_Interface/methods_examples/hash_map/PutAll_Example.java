package lesson_15_Map_Interface.methods_examples.hash_map;

import java.util.HashMap;
import java.util.Map;

// Метод putAll(Map<? extends K,? extends V> m)
// копіює всі зіставлення з указаного Map в певний Map.
// Ці зіставлення замінять будь-які зіставлення, які
// певний Map мав для будь-якого з ключів, які зараз
// є у вказаному Map.
public class PutAll_Example {
    public static void main(String[] args) {
        // Створюємо Map 1
        Map<String, String> map1 = new HashMap<>();
        // Додаємо елементи
        map1.put("abc1", "orange");
        map1.put("dvc3", "apricot");
        map1.put("kot7", "kiwi");
        map1.put("est8", "mango");
        // Виведення елементів
        System.out.println("1) Data: " + map1);

        // Створюємо Map 2
        Map<String, String> map2 = new HashMap<>();
        // Додаємо елементи
        map2.put("aac2", "orange");
        map2.put("dvc3", "cherry"); // <- ключ є в Map 1
        map2.put("mey1", "kiwi");
        // Виведення елементів
        System.out.println("2) Data: " + map2);

        // Додаємо Map 2 в Map 1
        map1.putAll(map2);
        // Виведення елементів Map 1
        System.out.println("3) Data: " + map1);
    }
}
