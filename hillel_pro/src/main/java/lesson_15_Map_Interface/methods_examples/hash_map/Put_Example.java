package lesson_15_Map_Interface.methods_examples.hash_map;

import java.util.HashMap;
import java.util.Map;

// Метод put(K key, V value) пов’язує вказане значення
// з указаним ключем у Map.
// Якщо Map раніше містив відображення для ключа,
// старе значення буде замінено.
public class Put_Example {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("abc1", "orange");
        map.put("dvc3", "apricot");
        map.put("dvc3", "plum"); // <- дублікат ключа
        map.put(null, "pepper"); // <- null ключ
        map.put("sat2", "pepper");
        map.put("est8", null);
        System.out.println("Data: " + map);
    }
}
