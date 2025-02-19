package lesson_15_Map_Interface.methods_examples.tree_map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

// Метод ceilingEntry(K key) повертає зіставлення ключ-значення,
// пов’язане з найменшим ключем, більшим або рівним заданому ключу,
// або null, якщо такого ключа немає.
public class CeilingEntry_Example {
    public static void main(String[] args) {
        // Створюємо Map
        NavigableMap<String, String> map = new TreeMap<>();
        // Додаємо елементи
        map.put("abc1", "orange("+"abc1".hashCode()+")");
        map.put("dvc3", "apricot("+"dvc3".hashCode()+")");
        map.put("sat2", "pepper("+"sat2".hashCode()+")");
        map.put("est8", null); // <- null значення
        map.put("kyo7", "kiwi("+"kyo7".hashCode()+")");
        // Виведення елементів
        System.out.println("1) Data: " + map);

        // Намагаємося отримати дані за існуючим ключем
        Map.Entry<String, String> map1 =
                map.ceilingEntry("est8");
        // Виведення елементів
        System.out.println("2) Data: " + map1);

        // Намагаємося отримати дані за неіснуючим ключем,
        // який не за межами Map
        Map.Entry<String, String> map2 =
                map.ceilingEntry("feo5");
        // Виведення елементів
        System.out.println("Key=feo5, hashCode=" + "feo5".hashCode());
        System.out.println("3) Data: " + map2);

        // Намагаємося отримати дані за неіснуючим ключем,
        // який за межами Map
        Map.Entry<String, String> map3 =
                map.ceilingEntry("soi4");
        // Виведення елементів
        System.out.println("Key=soi4, hashCode=" + "soi4".hashCode());
        System.out.println("4) Data: " + map3);
    }
}
