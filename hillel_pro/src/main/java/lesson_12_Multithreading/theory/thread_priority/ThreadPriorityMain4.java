package lesson_12_Multithreading.theory.thread_priority;

public class ThreadPriorityMain4 {
    public static void main(String[] args) {
        Thrd1 thread01 = new Thrd1();
        Thrd2 thread02 = new Thrd2();
        Thrd3 thread03 = new Thrd3();

        thread01.start();
        thread02.start();
        thread03.start();

        // Устанавливаем приоритеты потоков при помощи значений
        thread01.setPriority(2);
        int threadPriority1 = thread01.getPriority();
        thread02.setPriority(9);
        int threadPriority2 = thread02.getPriority();
        thread03.setPriority(6);
        int threadPriority3 = thread03.getPriority();

        System.out.println("Thread 1 priority is " + threadPriority1 +
        "\nThread 2 priority is " + threadPriority2 +
                "\nThread 3 priority is " + threadPriority3);

    }
    /*
            Результат выполнения кода:

            Thread 2 is running...
            Thread 3 is running...
            Thread 1 is running...
            Thread 1 priority is 2
            Thread 2 priority is 9
            Thread 3 priority is 6
     */
}

class Thrd1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 1 is running...");
    }
}

class Thrd2 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 2 is running...");
    }
}

class Thrd3 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 3 is running...");
    }
}
