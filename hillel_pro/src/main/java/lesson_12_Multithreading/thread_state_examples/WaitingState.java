package lesson_12_Multithreading.thread_state_examples;

public class WaitingState implements Runnable {
    public static Thread t1;

    public static void main(String[] args) {
        t1 = new Thread(new WaitingState());
        t1.start();
    }

    @Override
    public void run() {
        Thread t2 = new Thread(new DemoWaitingStateRunnable());
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}

class DemoWaitingStateRunnable implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        System.out.println(WaitingState.t1.getState());
    }
}

