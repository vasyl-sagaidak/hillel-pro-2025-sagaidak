package lesson_12_Multithreading.theory.atomic_variables;

import java.util.concurrent.atomic.AtomicInteger;

// Метод getAndIncrement() увеличивает заданное значение на единицу
// и возвращает знчение до обновления, имеющее тип int.
public class GetAndIncrement_MethodExample {

    public static void main(String[] args) {
        int initVal = 3;
        String[] items = new String[] {"orange", "mango",
                "kiwi", "apple"};
        getOutput(handleVar(initVal));
        getOutput(handleArray(items));
    }

    public static String handleVar(int initVal) {
        AtomicInteger val = new AtomicInteger(initVal);
        int prevVal = val.getAndIncrement();
        return "Previous value is " + prevVal +
                "\nUpdated value is "  + val;
    }

    public static String handleArray(String[] items) {
        // AtomicInteger как счетчик
        AtomicInteger counter = new AtomicInteger(1);
        StringBuilder sb = new StringBuilder();
        for (String item : items) {
            sb.append(String.format("%d) %s%n",
                    counter.getAndIncrement(), item));
        }
        return "DATA:\n" + sb;
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}

// Результат выполнения кода:

// Previous value is 3
// Updated value is 4
// DATA:
// 1) orange
// 2) mango
// 3) kiwi
// 4) apple