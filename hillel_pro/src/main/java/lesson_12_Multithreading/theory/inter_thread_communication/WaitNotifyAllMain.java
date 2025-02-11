package lesson_12_Multithreading.theory.inter_thread_communication;

class MyThread011 extends Thread {

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


class MyThread022 extends Thread {

    final MyThread011 thread01;

    MyThread022(MyThread011 thread01) {
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


class MyThread033 extends Thread {

    final MyThread011 thread01;

    MyThread033(MyThread011 thread01) {
        this.thread01 = thread01;
    }

    public void run() {
        synchronized (this.thread01) {
            System.out.println(Thread.currentThread().getName()
                    + "...starts");
            this.thread01.notifyAll();
            System.out.println(Thread.currentThread().getName()
                    + "...notified");
        }
    }
}


// При запуске, программа не должна зависать,
// поскольку все потоки нотифицированны.
public class WaitNotifyAllMain {

    public static void main(String[] args) throws InterruptedException {

        MyThread011 thread01 = new MyThread011();
        MyThread022 thread02 = new MyThread022(thread01);
        MyThread033 thread03 = new MyThread033(thread01);

        Thread t1 = new Thread(thread01, "Thread-1");
        Thread t2 = new Thread(thread02, "Thread-2");
        Thread t3 = new Thread(thread03, "Thread-3");

        t1.start();
        t2.start();
        Thread.sleep(100);
        t3.start();
    }
}

// Результат (программа не виснет)

// Thread-1...starts
// Thread-2...starts
// Thread-3...starts
// Thread-3...notified
// Thread-1...notified
// Thread-2...notified