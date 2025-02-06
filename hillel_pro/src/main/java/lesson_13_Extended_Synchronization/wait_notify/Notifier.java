package lesson_13_Extended_Synchronization.wait_notify;

public class Notifier implements Runnable {
    private Message message;

    public Notifier(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

    }
}
