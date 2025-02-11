package lesson_12_Multithreading.theory.inter_thread_communication;

class MyThread01 extends Thread {

    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName()
                    + "...starts");
            try {
                this.wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName()
                    + "...notified");
        }
    }
}

class MyThread02 extends Thread {

    final MyThread01 thread01;

    MyThread02(MyThread01 thread01) {
        this.thread01 = thread01;
    }

    public void run() {
        synchronized (this.thread01) {
            System.out.println(Thread.currentThread().getName()
                    + "...starts");
            try {
                this.thread01.wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName()
                    + "...notified");
        }
    }
}

class MyThread03 extends Thread {

    final MyThread01 thread01;

    MyThread03(MyThread01 thread01) {
        this.thread01 = thread01;
    }

    public void run() {
        synchronized (this.thread01) {
            System.out.println(Thread.currentThread().getName()
                    + "...starts");
            this.thread01.notify();
            System.out.println(Thread.currentThread().getName()
                    + "...notified");
        }
    }
}

// При запуске, программа может зависнуть,
// поскольку не все потоки нотифицированы
public class WaitNotifyMain {

    public static void main(String[] args) throws InterruptedException {

        MyThread01 thread01 = new MyThread01();
        MyThread02 thread02 = new MyThread02(thread01);
        MyThread03 thread03 = new MyThread03(thread01);

        Thread t1 = new Thread(thread01, "Thread-1");
        Thread t2 = new Thread(thread02, "Thread-2");
        Thread t3 = new Thread(thread03, "Thread-3");

        t1.start();
        t2.start();
        Thread.sleep(100);
        t3.start();
    }
}

// Результат (программа виснет после определенного вывода):

// Thread-2...starts
// Thread-1...starts
// Thread-3...starts
// Thread-3...notified
// Thread-2...notified