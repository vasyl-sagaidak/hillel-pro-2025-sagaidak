package lesson_12_Multithreading.theory.thread_methods;

// Запускаем потоки. Один из них прерываем.
// Как только определенный поток перейдет в спящее состояние,
// он будет немедленно прерван.
public class InterruptMethodMain1 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
        thread1.interrupt(); // <- прерывает поток
    }
    // Результат выполнения:
    /*
        Thread 2 - 1
        Thread 1 - 1
        Thread 1 interrupted.
        Thread 2 - 2
        Thread 2 - 3
     */
}

class Thread1 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Thread 1 - " + i);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 1 interrupted.");
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Thread 2 - " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 2 interrupted.");
        }
    }
}
