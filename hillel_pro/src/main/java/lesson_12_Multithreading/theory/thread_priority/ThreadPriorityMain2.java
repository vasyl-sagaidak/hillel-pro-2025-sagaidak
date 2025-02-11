package lesson_12_Multithreading.theory.thread_priority;

public class ThreadPriorityMain2 {
    public static void main(String[] args) {
        FirstThread thread01 = new FirstThread();
        SecondThread thread02 = new SecondThread();
        ThirdThread thread03 = new ThirdThread();

        thread01.start();
        thread02.start();
        thread03.start();
    }
    /*
            Результат работы кода:

            Thread 3 priority is 5
            Thread 2 priority is 10
            Thread 1 priority is 1
     */
}

class FirstThread extends Thread {
    @Override
    public void run() {
        // Устанавливаем приоритет потока через константу,
        // которая определена в Сlass Thread
        this.setPriority(Thread.MIN_PRIORITY);
        int threadPriority = this.getPriority();
        System.out.println("Thread 1 priority is " +
                threadPriority);
    }
}

class SecondThread extends Thread {
    @Override
    public void run() {
        // Устанавливаем приоритет потока через константу,
        // которая определена в Сlass Thread
        this.setPriority(Thread.MAX_PRIORITY);
        int threadPriority = this.getPriority();
        System.out.println("Thread 2 priority is " +
                threadPriority);
    }
}

class ThirdThread extends Thread {
    @Override
    public void run() {
        // Устанавливаем приоритет потока через константу,
        // которая определена в Сlass Thread
        this.setPriority(Thread.NORM_PRIORITY);
        int threadPriority = this.getPriority();
        System.out.println("Thread 3 priority is " +
                threadPriority);
    }
}