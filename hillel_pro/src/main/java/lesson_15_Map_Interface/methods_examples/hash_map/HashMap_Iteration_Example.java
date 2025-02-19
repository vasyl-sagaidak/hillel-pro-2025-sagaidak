package lesson_15_Map_Interface.methods_examples.hash_map;

import java.util.HashMap;
import java.util.Map;

// Ітерація по Map
public class HashMap_Iteration_Example {
    public static void main(String[] args) {
        // Створюємо Map
        Map<String, String> map = new HashMap<>();
        // Додаємо елементи
        map.put("Vasyl", "Java Developer & Psytrance Artist");
        map.put("Rodion", "TypeScript Developer");
        map.put("Alex", "JavaScript Developer");
        map.put(null, "Electronic Musician");
        map.put("Kate", "Techno DJ & System Architect");
        map.put("Bob", null);

        // Виведення елементів через for-each.
        // Метод getKey() повертає ключ.
        // Метод getValue() повертає значення.
        System.out.println("\n1)Data: ");
        for (Map.Entry<String, String> name : map.entrySet()) {
            System.out.println(name.getKey() + "=" + name.getValue());
        }

        // Виведення елементів через
        // forEach(BiConsumer<? super K,? super V> action)
        // виконує вказану дію для кожного запису в Map,
        // доки всі записи не будуть оброблені або дія
        // не викличе виняток.
        System.out.println("\n2)Data: ");
        map.forEach(
                // Лямбда-вираз, який стосується галузі
                // функціонального програмування (розглядається окремо).
                (key, value) ->
                        System.out.println(key + "=" + value)
        );
    }
}
