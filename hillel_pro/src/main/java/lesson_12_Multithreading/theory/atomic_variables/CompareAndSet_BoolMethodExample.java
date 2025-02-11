package lesson_12_Multithreading.theory.atomic_variables;

import java.util.concurrent.atomic.AtomicBoolean;

// Метод compareAndSet(boolean expect, boolean update)
// атомарно заменяет текущее значение на заданное обновленное значение,
// если текущее значение равно (==) ожидаемому значению.
public class CompareAndSet_BoolMethodExample {
    public static void main(String[] args) {
        // Можем установить значение в конструкторе
        AtomicBoolean val = new AtomicBoolean(true);
        System.out.println("Initial value is " + val);
        // Проверяем, было ли предыдущее значение true,
        // а потом обновляем его.
        // Если изменить сравниваемое значение то обновления не произойдет.
        boolean res = val.compareAndSet(true, false);
        if (res)
            System.out.println("Updated value is " + val);
        else
            System.out.println("The value was not updated");
    }
}

// Результат работы кода:

// Initial value is true
// Updated value is false