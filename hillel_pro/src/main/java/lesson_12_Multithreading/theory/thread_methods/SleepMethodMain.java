package lesson_12_Multithreading.theory.thread_methods;

// Усыпляем потоки, используя метод Thread.sleep().
// Каждый поток будет спать  течении определенного количества миллисекунд,
// а потом возобновит свое выполнение.
// Метод currentThread() возвращает обьект Thread для текущего потока.
// Метод getName() возвращает имя текущего потока.

class MyThread001 extends Thread {

    public MyThread001(String str) {
        super(str);
    }

    @Override
    public void run() {
        // Вывод сразу после старта программы
        System.out.println(Thread.currentThread().getName() + " started.");

    try {
        // Усыпляем на 2000 миллисекунд
        MyThread001.sleep(2000);
    } catch (InterruptedException ie) {
        System.out.println("Exception: " + ie);
    }
    // Вывод после некоторого количества времени на засыпание потока
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}

public class SleepMethodMain {
    public static void main(String[] args) {
        // Через конструктор указываем имя потока
        MyThread001 thread01 = new MyThread001("Thread 1");
        MyThread001 thread02 = new MyThread001("Thread 2");
        // Стартуем потоки
        thread01.start();
        thread02.start();
    }
    // Результатом работы программы будет вывод в консоль текста следующей последовательности и содержания:
    // Thread 1 started.
    // Thread 2 started.
    // Thread 1 finished.
    // Thread 2 finished.
}