package lesson_12_Multithreading.theory.threads_sync;

public class DataHandler201 {

    void printData(int n) {
        // Синхронизированный блок
        synchronized (this) {
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
}

class MyThread201 extends Thread {

    DataHandler dataHandler;

    MyThread201(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }

    public void run() {
        // Используется число 5
        // для обработки данных
        dataHandler.printData(5);
    }
}


class MyThread202 extends Thread {

    DataHandler dataHandler;

    MyThread202(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }

    public void run() {
        // Используется число 100
        // для обработки данных
        dataHandler.printData(100);
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