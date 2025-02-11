package lesson_12_Multithreading.theory.atomic_variables;

import java.util.concurrent.atomic.AtomicInteger;

// Метод compareAndSet(int expect, int update) устанавливает
// значение в переданное значение в параметре, если текущее
// значение равно ожидаемому значению, которое так же
// передается в качестве параметра.
// Метод возвращает логическое значение, которое дает представление
// о том, было ли выполнено обновление значения.
public class CompareAndSet_IntMethodExample {
    public static void main(String[] args) {
        // Можем установить в конструкторе
        AtomicInteger val = new AtomicInteger(0);
        System.out.println("Initial value is " + val);
        // Проверяем, было ли предыдущее значение 0,
        // а потом обновляем его.
        // Если изменить сравниваемое значение то обновления не произойдет.
        boolean res = val.compareAndSet(0, 5);
        if (res)
            System.out.println("Updated value is " + val);
        else
            System.out.println("The value was not updated");
    }
}

// Результат работы кода:

// Initial value is 0
// Updated value is 5