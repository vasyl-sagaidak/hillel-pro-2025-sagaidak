package lesson_13_Extended_Synchronization.wait_notify;

public class Waiter implements Runnable {
    public Waiter(Message message) {
        this.message = message;
    }

    private Message message;

    @Override
    public void run() {
    String name = Thread.currentThread().getName();
    synchronized (message) {
        try{
            System.out.println(name + " waiting to get notification " + System.currentTimeMillis());

        }
    }
    }
}
