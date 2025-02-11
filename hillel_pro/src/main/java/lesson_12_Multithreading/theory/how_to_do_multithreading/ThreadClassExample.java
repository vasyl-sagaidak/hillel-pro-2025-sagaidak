package lesson_12_Multithreading.theory.how_to_do_multithreading;

public class ThreadClassExample extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

class Main01 {
    public static void main(String[] args) {
        ThreadClassExample mt = new ThreadClassExample();
        // Вызов Thread.start() для запуска нового потока
        // Результатом будет вывод Thread is running...
        mt.start();
    }
}

class Main02 {
    public static void main(String[] args) {
        ThreadClassExample mt = new ThreadClassExample();
        // Если вызовем метод run() прямо,
        // не используя метод start(),
        // потоку не будет выделенно новый стек вызовов.
        // Поток начнет работать в поточном стеке вызовов,
        // тоесть стеку вызовов основного потока.
        // В итоге, многопоточности не будет.
        // Результатом будет вывод Thread is running...
        mt.run();
    }
}

class Main03 {
    public static void main(String[] args) {
        ThreadClassExample mt = new ThreadClassExample();
        // Вызов Thread.start для запуска нового потока
        mt.start();
        // Можем ли мы запустить поток дважды?
        // Нет, поток не может быть запущен дважды.
        // Если попробуете это сделать, будет выброшено
        // исключение IllegalThreadStateException.
        mt.start();
    }
}