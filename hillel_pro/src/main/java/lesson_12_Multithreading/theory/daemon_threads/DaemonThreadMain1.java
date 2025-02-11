package lesson_12_Multithreading.theory.daemon_threads;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // Проверка того, является ли поток демоном или нет,
        // при помощи метода isDaemon(), который возвращает true,
        // если поток является потоком демоном, иначе false.
        if (Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon thread");
        } else {
            System.out.println(getName() + " is User thread");
        }
    }
}

// Метод setDaemon(boolean on) помечает поток как поток-демон
// либо поток пользователя. JVM завершает работу, когда единственными
// запущенными потоками являются потоки-демоны.
// Если параметр on является true, то поток является потоком-демоном.
// Этот метод необходимо вызвать перед запуском потока,
// иначе будет выброшено исключение IllegalThreadStateException,
// если поток активен.
public class DaemonThreadMain1 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        // Установка потока в качестве потока-демона
        thread1.setDaemon(true);
        thread1.start();

        // Установка потока НЕ в качестве потока-демона
        thread2.setDaemon(false);
        thread2.start();

        // Установка потока в качестве потока-демона
        thread3.setDaemon(true);
        thread3.start();
    }
    /*
        Результат работы кода:

        Thread 3 is Daemon thread
        Thread 1 is Daemon thread
        Thread 2 is User thread

     */
}
