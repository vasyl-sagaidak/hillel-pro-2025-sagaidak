package lesson_12_Multithreading.theory.how_to_do_multithreading;

// Класс который реализует Interface Runnable.
// После реализации Interface Runnable в классе
// необходимо реализовать метод run().
 class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class InterfaceRunnableImplExample {
    public static void main(String[] args) {
        // Если вы реализуете Interface Runnable в своем класса
        // необходимо явно создать обьект Сlass Thread и передать его конструктор
        // обьект класса реализованного через Interface Runnable.
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        // Для вызова метода run() используется метод start().
        // При вызове start() потоку предоставляется новый стек,
        // и вызывается метод run() для введение нового потока в программу.
        thread.start();
    }
    // Результатом работы программы будет вывод в консоль текста следующей последовательности и содержания:
    // Thread is running...
}