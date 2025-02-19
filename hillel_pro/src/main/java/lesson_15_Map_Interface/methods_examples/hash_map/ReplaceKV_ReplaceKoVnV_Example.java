package lesson_15_Map_Interface.methods_examples.hash_map;

import java.util.HashMap;
import java.util.Map;

// Метод replace(K key, V value) замінює запис (значення)
// для вказаного ключа, лише якщо він наразі зіставлено
// з деяким значенням.
// Повертає попереднє значення, пов’язане з указаним ключем,
// або значення null, якщо для ключа не було відображення.
//
// Метод replace(K key, V oldValue, V newValue) замінює запис
// для вказаного ключа, лише якщо наразі зіставлено з вказаним
// значенням.
// Повертає true, якщо значення було замінено.
public class ReplaceKV_ReplaceKoVnV_Example {
    public static void main(String[] args) {
        // Створюємо Map
        Map<String, String> map = new HashMap<>();
        // Додаємо елементи
        map.put("abc1", "orange");
        map.put("dvc3", "apricot");
        map.put("sat2", "pepper");
        map.put("est8", null); // <- null значення
        // Виведення елементів
        System.out.println("1) Data: " + map);

        // Намагаємося змінити значення для неіснуючого ключа
        map.replace("syo5", "mango");
        // Виведення елементів. Без змін.
        System.out.println("2) Data: " + map);

        // Намагаємося змінити значення для існуючого ключа
        map.replace("dvc3", "mango");
        // Виведення елементів. Є зміни.
        System.out.println("3) Data: " + map);

        // Намагаємося змінити значення для існуючого ключа,
        // який зіставлено зі значенням null
        map.replace("est8", "mango");
        // Виведення елементів. Є зміни.
        System.out.println("4) Data: " + map);

        // Намагаємося змінити значення для існуючого ключа,
        // який зіставлено не з відповідним йому значенням.
        map.replace("abc1", "kiwi", "mango");
        // Виведення елементів. Без змін.
        System.out.println("5) Data: " + map);

        // Намагаємося змінити значення для існуючого ключа,
        // який зіставлено з відповідним йому значенням.
        map.replace("abc1", "orange", "avocado");
        // Виведення елементів. Є зміни.
        System.out.println("6) Data: " + map);
    }
}
