package lesson_12_Multithreading.thread_state_examples;

public class NewState {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        System.out.println(t.getState()); // NEW
        t.start();
        System.out.println(t.getState()); // RUNNABLE
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {

    }
}
