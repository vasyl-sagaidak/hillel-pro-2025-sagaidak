package lesson_20_Graphs.extratask;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PetrolStation {
    private double amount;
    private final LinkedBlockingQueue<Double> queue = new LinkedBlockingQueue<>(3);
    private final Lock lock = new ReentrantLock();

    public PetrolStation (double fuelAmount) {
        this.amount = fuelAmount;
    }

    public void doRefuel(double liters) {
        try {
            // Кладемо у нашу кьюшку запит від потока на заправку певної кількості літрів
            queue.put(liters);
            System.out.println(Thread.currentThread().getName() + " очікує на заправку " + liters + " л");

            // Виконуємо рандомне очікування від 3 до 10 секунд у процесі заправки
            int time = ThreadLocalRandom.current().nextInt(3,11);
            Thread.sleep(time * 1000L);

            // Виконуємо синхронізацію спільного ресурсу
            lock.lock();
            try {
                if (amount >= liters) {
                    amount -= liters;
                    System.out.println(Thread.currentThread().getName() + " заправлено " + liters
                            + " л палива. Залишилось: " + amount + " л");
                } else {
                    System.out.println(Thread.currentThread().getName() + " недостатньо палива!");
                }
            } finally {
                lock.unlock();
            }
            // Видаляємо потік з черги після виконання процедури заправки
            queue.take();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        }
}
