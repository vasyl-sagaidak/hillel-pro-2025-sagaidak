package lesson_15_Map_Interface.methods_examples.hash_map;
import java.util.HashMap;
import java.util.Map;

// Метод containsKey(Object key) повертає true,
// якщо Map містить відображення для вказаного ключа.
public class ContainsKey_Example {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Vasyl", 37);
        ages.put("Valentyna", 57);
        ages.put("Sofiia", 14);

        System.out.println("Data" + ages);

        System.out.println("Result 1");
        boolean isContains1 = ages.containsKey("Sofiia");
        if (isContains1) {
            System.out.println("is " + isContains1);
        } else {
            System.out.println("is " + isContains1);
        }
        System.out.println();
        System.out.println("Result 2");
        boolean isContains2 = ages.containsKey("Inessa");
        if (isContains2){
            System.out.println("is " + isContains2);
        } else {
            System.out.println("is " + isContains2);
        }
    }
}
