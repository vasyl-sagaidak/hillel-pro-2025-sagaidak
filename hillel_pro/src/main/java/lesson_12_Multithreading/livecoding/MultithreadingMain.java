package lesson_12_Multithreading.livecoding;

public class MultithreadingMain {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();

        myThread.join();

        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + " index "+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

//    Thread myRunnable = new Thread(new MyRunnable());
//    myRunnable.start();

    }

}

