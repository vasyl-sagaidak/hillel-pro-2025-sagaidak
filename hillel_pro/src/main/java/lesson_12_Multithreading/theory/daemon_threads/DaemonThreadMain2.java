package lesson_12_Multithreading.theory.daemon_threads;

// Потоки демоны являются низко-уровневыми.
// Приоритет потоков, которые получаем, устанавливается JVM.
class CustomThread extends Thread {
    public CustomThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon thread");
        } else {
            System.out.println(getName() + " is User thread");
        }

        System.out.println(getName() + " priority "
        + Thread.currentThread().getPriority());
    }
}

// Потоки, созданные в другом потоке (тут - главный поток),
// могут получить приоритет потока, который установлен для
// родительского потока
public class DaemonThreadMain2 {
    public static void main(String[] args) {
        CustomThread thread1 = new CustomThread("Thread 1");
        CustomThread thread2 = new CustomThread("Thread 2");
        CustomThread thread3 = new CustomThread("Thread 3");

        thread1.setDaemon(true);
        thread1.start();
        thread2.start();
        thread3.setDaemon(true);
        thread3.start();
    }

    /*
        Результат работы кода:

        Thread 2 is User thread
        Thread 3 is Daemon thread
        Thread 1 is Daemon thread
        Thread 3 priority 5
        Thread 1 priority 5
        Thread 2 priority 5

     */
}
