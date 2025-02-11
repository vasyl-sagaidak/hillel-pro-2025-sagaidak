package lesson_12_Multithreading.theory.thread_priority;

public class ThreadPriorityMain3 {
    public static void main(String[] args) {
        MThread1 thread01 = new MThread1();
        MThread2 thread02 = new MThread2();
        MThread3 thread03 = new MThread3();

        thread01.start();
        thread02.start();
        thread03.start();
    }

    /*
        Результат работы кода:

        Thread 3 priority is 6
        Thread 2 priority is 9
        Thread 1 priority is 2
     */
}

class MThread1 extends Thread {
    @Override
    public void run() {
        // Устанавливаем приоритет потока посредством значения
        this.setPriority(2);
        int threadPriority = this.getPriority();
        System.out.println("Thread 1 priority is "
                + threadPriority);
    }
}

class MThread2 extends Thread {
    @Override
    public void run() {
        // Устанавливаем приоритет потока посредством значения
        this.setPriority(9);
        int threadPriority = this.getPriority();
        System.out.println("Thread 2 priority is "
                + threadPriority);
    }
}

class MThread3 extends Thread {
    @Override
    public void run() {
        // Устанавливаем приоритет потока посредством значения
        this.setPriority(6);
        int threadPriority = this.getPriority();
        System.out.println("Thread 3 priority is "
                + threadPriority);
    }
}