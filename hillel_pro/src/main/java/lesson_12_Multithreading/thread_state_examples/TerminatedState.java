package lesson_12_Multithreading.thread_state_examples;

public class TerminatedState implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new TerminatedState());
        t1.start();
        Thread.sleep(1000);
        System.out.println(t1.getState());
    }
    @Override
    public void run() {

    }
}
