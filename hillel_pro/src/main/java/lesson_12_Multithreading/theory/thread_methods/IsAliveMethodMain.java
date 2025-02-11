package lesson_12_Multithreading.theory.thread_methods;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Result 1");

        try {
            // Переводим поток в спящий режим на 300 мс
            // используем метод sleep()
            Thread.sleep(300);
        } catch (InterruptedException ie) {
            System.out.println("Exception " + ie);
        }
        System.out.println("Result 2");
    }
}

public class IsAliveMethodMain {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        // Метод join() ждет, пока поток,
        // на который он влияет, умрет.
        thread1.join();
        thread2.start();

        // Проверяем жив ли поток или нет.
        // Возвращает логическое значение true, если поток жив,
        // иначе false.
        System.out.println("Thread 1 " + thread1.isAlive());
        System.out.println("Thread 2 " + thread2.isAlive());
    }
    // Результат вывода:
    // Result 1
    // Result 2
    // Result 1
    // Thread 1 false
    // Thread 2 true
    // Result 2
}

