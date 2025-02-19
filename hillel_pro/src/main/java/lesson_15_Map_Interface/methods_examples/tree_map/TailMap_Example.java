package lesson_15_Map_Interface.methods_examples.tree_map;

import java.util.SortedMap;
import java.util.TreeMap;

// Метод tailMap(K fromKey) повертає вигляд частини Map,
// ключі якого більші або дорівнюють fromKey.
public class TailMap_Example {
    public static void main(String[] args) {
        // Створюємо Map
        SortedMap<String, String> map = new TreeMap<>();
        // Додаємо елементи
        map.put("abc1", "orange");
        map.put("dvc3", "apricot");
        map.put("sat2", "pepper");
        map.put("est8", null); // <- null значення
        map.put("kyo7", "kiwi");
        // Виведення елементів
        System.out.println("1) Data: " + map);

        // Намагаємося отримати дані
        SortedMap<String, String> map1 =
                map.tailMap("est8");
        System.out.println("2) Data: " + map1);
    }
}
