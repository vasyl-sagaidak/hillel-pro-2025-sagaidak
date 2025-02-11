package lesson_12_Multithreading.theory.mainthread;

// Поток который является дочерним для главного потока
class MTHRD01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Thread 1 - " + i);
        }
    }
}

public class MainThreadMain extends Thread {

    public static void main(String[] args) {

        // Получение ссылки на основной поток
        Thread mainThread = Thread.currentThread();

        // Получение имени основного потока
        System.out.println("Current thread name is "
        + mainThread.getName());

        // Смена имени основного потока
        mainThread.setName("MySuperMain");
        System.out.println("After change, name is "
                + mainThread.getName());

        // Получение приоритета основного потока
        System.out.println("Main Thread priority is "
        + mainThread.getPriority());

        // Установка приоритета основного потока на MAX(10)
        mainThread.setPriority(MAX_PRIORITY);

        // Отображаем приоритет основного потока
        System.out.println("Main Thread new priority is "
        + mainThread.getPriority());

        for (int i = 0; i < 4; i++) {
            System.out.println("Main Thread - " + i);
        }

        // Основной поток создает дочерний поток
        // метод run() потока
        MTHRD01 thread01 = new MTHRD01();

        // Получение приоритета дочернего потока
        // который будет унаследован от основного потока,
        // поскольку он создается основным потоком
        System.out.println("Thread 1 priority is "
        + thread01.getPriority());

        // Установка приоритета дочернего потока на MIN(1)
        thread01.setPriority(MIN_PRIORITY);

        System.out.println("Thread 1 new priority is "
        + thread01.getPriority());

        // Запускаем дочерний поток
        thread01.start();
    }
    /*
        Результат выполнения кода:

        Current thread name is main
        After change, name is MySuperMain
        Main Thread priority is 5
        Main Thread new priority is 10
        Main Thread - 1
        Main Thread - 2
        Main Thread - 3
        Thread 1 priority is 10
        Thread 1 new priority is 1
        Thread 1 - 1
        Thread 1 - 2
        Thread 1 - 3

     */
}
