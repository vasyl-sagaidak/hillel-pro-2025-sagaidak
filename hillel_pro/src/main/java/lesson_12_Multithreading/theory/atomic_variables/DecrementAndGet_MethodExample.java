package lesson_12_Multithreading.theory.atomic_variables;

import java.util.concurrent.atomic.AtomicInteger;

// Метод decrementAndGet() уменьшает предыдущее значение
// на единицу и возвращает значение int типа после обновления.
public class DecrementAndGet_MethodExample {

    public static void main(String[] args) {
        AtomicInteger val = new AtomicInteger(8);
        System.out.println("Initial value is " + val);
        int res = val.decrementAndGet();
        System.out.println("Updated value is " + res);
    }
}

// Результат работы кода:

// Initial value is 8
// Updated value is 7


