package lesson_15_Map_Interface.methods_examples.hash_map;

import java.util.HashMap;
import java.util.Map;

// Метод get(Object key) повертає значення,
// на яке зіставляється вказаний ключ, або null,
// якщо Map не містить зіставлення для ключа.
public class Get_Example {
    public static void main(String[] args) {
        // Створюємо Map
        Map<String, String> map = new HashMap<>();
        // Додаємо елементи
        map.put("abc1", "orange");
        map.put("dvc3", "apricot");
        map.put(null, "pepper"); // <- null ключ
        map.put("sat2", "pepper");
        map.put("est8", null); // <- null значення
        // Виведення елементів
        System.out.println("Data: " + map);

        // Отримання за існуючим ключем
        String value1 = map.get("dvc3");
        System.out.println("Result 1 is " + value1);
        // Отримання за null ключем
        String value2 = map.get(null);
        System.out.println("Result 2 is " + value2);
        // Отримання за існуючим ключем, де значення null
        String value3 = map.get("est8");
        System.out.println("Result 3 is " + value3);
        // Отримання за неіснуючим ключем
        String value4 = map.get("mye4");
        System.out.println("Result 4 is " + value4);
    }
}
