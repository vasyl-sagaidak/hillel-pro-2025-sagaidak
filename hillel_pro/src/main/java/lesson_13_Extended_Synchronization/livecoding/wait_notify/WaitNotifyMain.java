package lesson_13_Extended_Synchronization.livecoding.wait_notify;

public class WaitNotifyMain {
    public static void main(String[] args) {
        Message message = new Message("I'm message");

        Waiter waiter = new Waiter(message);
        new Thread(waiter, "waiter").start();

        Waiter waiter1 = new Waiter(message);
        new Thread(waiter1, "waiter1").start();

        Notifier notifier  = new Notifier(message);
        new Thread(notifier, "notifier").start();
    }
}
