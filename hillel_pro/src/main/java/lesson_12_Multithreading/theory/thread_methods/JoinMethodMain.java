package lesson_12_Multithreading.theory.thread_methods;

class MyThread01 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 1 - AAA");
        try{
            Thread.sleep(500);
        } catch (InterruptedException ie) {
            System.out.println("Exception " + ie);
        }
        System.out.println("Thread 1 - BBB");
    }
}

class MyThread02 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 2 - AAA");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
            System.out.println("Exception " + ie);
        }
        System.out.println("Thread 2 - BBB");
    }
}

// Использование метода join().
// Если запускаем поток без использования метода join(),
// выполнение потока невозможно предугадать.
// Планировщик потоков планирует выполнение потоков.

public class JoinMethodMain {
    public static void main(String[] args) throws InterruptedException {
        MyThread01 myThread01 = new MyThread01();
        MyThread02 myThread02 = new MyThread02();
        myThread01.start();
        myThread01.join();
        myThread02.start();
    }
    // Результатом работы программы будет вывод в консоль текста следующей последовательности и содержания:
    // Thread 1 - AAA
    // Thread 1 - BBB
    // Thread 2 - AAA
    // Thread 2 - BBB
}