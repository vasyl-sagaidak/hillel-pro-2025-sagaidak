package lesson_12_Multithreading.theory.thread_priority;

// Если не устанавливаем приоритет потока,
// то по умолчанию он устанавливается JVM.
// Тут получаем приоритет потока по умолчанию
// при помощи метода getPriority().
public class ThreadPriorityMain1 {
    public static void main(String[] args) {
        PrioThread1 thread01 = new PrioThread1();
        PrioThread2 thread02 = new PrioThread2();
        PrioThread3 thread03 = new PrioThread3();

        thread01.start();
        thread02.start();
        thread03.start();

        System.out.println("Thread 1 priority is " + thread01.getPriority());
        System.out.println("Thread 2 priority is " + thread02.getPriority());
        System.out.println("Thread 3 priority is " + thread03.getPriority());
    }
    /*
        Результат работы кода:

        Thread 1 is running...
        Thread 2 is running...
        Thread 3 is running...
        Thread 1 priority is 5
        Thread 2 priority is 5
        Thread 3 priority is 5
     */
}

class PrioThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 1 is running...");
    }
}

class PrioThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 2 is running...");
    }
}

class PrioThread3 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 3 is running...");
    }
}
