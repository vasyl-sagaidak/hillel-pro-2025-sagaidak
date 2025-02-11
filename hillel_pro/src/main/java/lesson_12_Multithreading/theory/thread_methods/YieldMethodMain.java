package lesson_12_Multithreading.theory.thread_methods;

class MyThread0001 extends Thread {
    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            count++;
            System.out.println("Thread 1, count is " + count);
            Thread.yield();
        }
    }
}

class MyThread0002 extends Thread {
    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            count++;
            System.out.println("Thread 2, count is: " + count);
        }
    }
}

// MyThread0002 поток получит больше шансов выполнения.
// Потому что поток MyThread0001 вызывает метод yield().
public class YieldMethodMain {
    public static void main(String[] args) {
        MyThread0001 thread1 = new MyThread0001();
        MyThread0002 thread2 = new MyThread0002();
        thread1.start();
        thread2.start();
    }
    // Результат:
    /*
        Thread 2, count is 1
        Thread 2, count is 2
        Thread 2, count is 3
        Thread 1, count is 1
        Thread 1, count is 2
        Thread 1, count is 3
     */
}

