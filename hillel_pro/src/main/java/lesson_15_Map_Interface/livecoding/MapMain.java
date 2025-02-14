package lesson_15_Map_Interface.livecoding;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    // Ключ в мапе может быть null
    // Ключ в мапе должен быть иммутабельным
    // Хешмеп принимает дубликаты ключа, и нам про это ничего не говорит, а просто заменяяет значение по этому ключу.

    public static void main(String[] args) {
        // Створюємо Map
        Map<String, String> map = new HashMap<>();
        // Додаємо елементи
        map.put("abc1", "orange");
        map.put("dvc3", "apricot");
        map.put("dvc3", "plum"); // <- Дублікат ключа
        map.put(null, "pepper"); // <- null ключ
        map.put("sat2", "pepper");
        map.put("est8", null); // <- null значення
        // Виведення елементів
        System.out.println("Data: " + map);
    }
}
