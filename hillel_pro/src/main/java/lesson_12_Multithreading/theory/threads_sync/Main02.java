package lesson_12_Multithreading.theory.threads_sync;

class DataHandler {
    // Синхронизированный метод
    synchronized void printData(int n) {
        for (int i = 1; i <= 5; i++) {
            int res = n * i;
            System.out.println("Result is " + res);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Exception " + e);
            }
        }
    }
}


class MyThread101 extends Thread {

    DataHandler dataHandler;

    MyThread101(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }

    public void run() {
        // Используется число 5
        // для обработки данных
        dataHandler.printData(5);
    }
}


class MyThread102 extends Thread {

    DataHandler dataHandler;

    MyThread102(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }

    public void run() {
        // Используется число 100
        // для обработки данных
        dataHandler.printData(100);
    }
}


// Тут есть синхронизация.
// Исходящие данные должны быть последовательны. Расчеты выполняются
public class Main02 {

    public static void main(String[] args) {
        // Только один обьект
        DataHandler dataHandler = new DataHandler();

        MyThread101 t1 = new MyThread101(dataHandler);
        MyThread102 t2 = new MyThread102(dataHandler);

        t1.start();
        t2.start();
    }
}

// Результат работы кода:

// Result is 5
// Result is 10
// Result is 15
// Result is 20
// Result is 25
// Result is 100
// Result is 200
// Result is 300
// Result is 400
// Result is 500