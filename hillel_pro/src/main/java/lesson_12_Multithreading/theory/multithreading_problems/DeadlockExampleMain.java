package lesson_12_Multithreading.theory.multithreading_problems;

// Класс, который используется обеими потоками
class Shared {

    // Первый синхронизированный метод
    synchronized void test1(Shared s2) {
        System.out.println("test1-begin");
        SleepUtil.sleep(1000);
        // Блокирование обьекта s2 в методе test2
        s2.test2();
        System.out.println("test1-end");
    }

    // Второй синхронизированный метод
    synchronized void test2() {
        System.out.println("test2-begin");
        SleepUtil.sleep(1000);
        // Блокирование обьекта s1 в методе test1
        System.out.println("test2-end");
    }
}

class MyThread100 extends Thread {
    private final Shared s1;
    private final Shared s2;

    public MyThread100(Shared s1, Shared s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    // Запуск потока
    @Override
    public void run() {
        // Блокирование обьекта s1 в методе test1
        s1.test1(s2);
    }
}

class MyThread200 extends Thread {
    private final Shared s1;
    private final Shared s2;

    public MyThread200(Shared s1, Shared s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    // Запуск потока
    @Override
    public void run() {
        // Блокирование обьекта s2 в методе test2
        s2.test1(s1);
    }
}

// Класс для приостановки потока
class SleepUtil {
    static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

// При запуске программы, код работает в течении неопределенного времени
// (программа зависает), потому что потоки пребывают в состоянии
// взаимного блокирования и не позволяют коду выполняться.
public class DeadlockExampleMain {
    public static void main(String[] args) {
        Shared s1 = new Shared();
        Shared s2 = new Shared();

        // Создание и запуск первого потока
        MyThread100 t1 = new MyThread100(s1, s2);
        t1.start();

        // Создание и запуск второго потока
        MyThread200 t2 = new MyThread200(s1, s2);
        t2.start();

        // Усыпляем основной поток
        SleepUtil.sleep(2000);
    }
}

