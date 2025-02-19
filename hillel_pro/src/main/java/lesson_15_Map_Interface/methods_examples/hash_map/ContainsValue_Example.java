package lesson_15_Map_Interface.methods_examples.hash_map;

import java.util.HashMap;
import java.util.Map;

// Метод containsValue(Object value) повертає true,
// якщо Map зіставляє один або кілька ключів із вказаним
// значенням.
public class ContainsValue_Example {
    public static void main(String[] args) {
        // Створюємо Map
        Map<String, String> map = new HashMap<>();
        // Додаємо елементи
        map.put("abc1", "orange");
        map.put("dvc3", "apricot");
        map.put("sat2", "pepper");
        // Виведення елементів
        System.out.println("Data: " + map);

        // Намагаємося отримати результат за існуючим значенням.
        System.out.print("Result 1 ");
        boolean isContains1 = map.containsValue("apricot");
        if (isContains1) System.out.println("is " + isContains1);
        else System.out.println("is " + isContains1);

        // Намагаємося отримати результат за неіснуючим значенням.
        System.out.print("Result 2 ");
        boolean isContains2 = map.containsValue("mango");
        if (isContains2) System.out.println("is " + isContains2);
        else System.out.println("is " + isContains2);
    }
}
