package lesson_12_Multithreading.theory.threads_sync;

class DataHandler01 {
    // Не синхронизированный метод
    void printData(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Exception " + e);
            }
        }
    }
}

class MyThread01 extends Thread {

    DataHandler01 dataHandler;

    MyThread01(DataHandler01 dataHandler) {
        this.dataHandler = dataHandler;
    }

    public void run() {
        // Используется число 5
        // для обработки данных
        dataHandler.printData(5);
    }
}


class MyThread02 extends Thread {

    DataHandler01 dataHandler;

    MyThread02(DataHandler01 dataHandler) {
        this.dataHandler = dataHandler;
    }

    public void run() {
        // Используется число 100
        // для обработки данных
        dataHandler.printData(100);
    }
}

// Тут нет синхронизации,
// Потому исходящие данные спорны.
public class Main01 {

    public static void main(String[] args) {
        // Только один обьект
        DataHandler01 dataHandler = new DataHandler01();

        MyThread01 t1 = new MyThread01(dataHandler);
        MyThread02 t2 = new MyThread02(dataHandler);

        t1.start();
        t2.start();
    }
}

// Результатом работы кода будет:

// Result is 5
// Result is 100
// Result is 10
// Result is 200
// Result is 300
// Result is 15
// Result is 400
// Result is 20
// Result is 500
// Result is 25