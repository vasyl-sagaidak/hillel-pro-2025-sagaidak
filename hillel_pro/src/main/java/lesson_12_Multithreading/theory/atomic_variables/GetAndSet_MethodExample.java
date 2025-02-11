package lesson_12_Multithreading.theory.atomic_variables;

import java.util.concurrent.atomic.AtomicBoolean;

// Метод getAndSet(boolean newValue)
// атомарно устанавливает заданное значение и
// возвращает предыдущее значение
public class GetAndSet_MethodExample {
    public static void main(String[] args) {
        // Можем установить значение в конструкторе
        AtomicBoolean val = new AtomicBoolean(true);
        System.out.println("Initial value is " + val);
        // Проверяем, было ли предыдущее значение true,
        // а потом обновляем его.
        // Если изменить сравниваемое значение то обновления не произойдет.
        boolean res = val.getAndSet(false);
        if (res)
            System.out.println("Updated value is " + val +
                    "\nPrevious value is " + res);
        else
            System.out.println("The value was not updated");
    }
}

// Результат работы кода:

// Initial value is true
// Updated value is false
// Previous value is true