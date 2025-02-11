package lesson_13_Extended_Synchronization.livecoding.wait_notify;

/*
                wait() vs. sleep()
wait() - пренадлежит классу Object | sleep() - принадлежит классу Thread.
wait() - освобождает lock во время синхронизации. | sleep() - не освобождает lock во время синхронизации.
wait() - может вызываться только из synchronized контекста, тоесть внутри синхронизованного класса, метода,
         блока кода.
 */

public class Waiter implements Runnable {

    private Message message;

    public Waiter(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
    String name = Thread.currentThread().getName();
    synchronized (message) {
        try{
            System.out.println(name + " waiting to get notification " + System.currentTimeMillis());
            message.wait(); // Переводит поток из состояния Running, в состояние Non-Runnable.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }
}
