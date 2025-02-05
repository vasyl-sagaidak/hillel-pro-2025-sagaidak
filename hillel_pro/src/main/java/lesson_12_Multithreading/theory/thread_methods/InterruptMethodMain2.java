package lesson_12_Multithreading.theory.thread_methods;

public class InterruptMethodMain2 {
    public static void main(String[] args) {
        ThreadMy01 thread1 = new ThreadMy01();
        ThreadMy02 thread2 = new ThreadMy02();

        thread1.start();
        thread1.interrupt(); // <- проверяем поток
        thread2.start();
    }
    // Результат работы кода:
    /*
        **Thread is interrupted.
        Thread 1 is running...
        Thread 1 is running...
        Thread 2 is running...
        Thread 2 is running...
        Thread 2 is running...**
     */
}

class ThreadMy01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            // Метод interrupted() проверяет, был ли текущий
            // поток прерван
            if (Thread.interrupted()) {
                System.out.println("Thread 1 interrupted.");
            } else {
                System.out.println("Thread 1 is running...");
            }
        }
    }
}

class ThreadMy02 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            // Метод interrupted() проверяет, был ли текущий
            // поток прерван
            if (Thread.interrupted()) {
                System.out.println("Thread 2 interrupted.");
            } else {
                System.out.println("Thread 2 is running...");
            }
        }
    }
}
