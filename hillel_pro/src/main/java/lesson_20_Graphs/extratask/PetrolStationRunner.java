package lesson_20_Graphs.extratask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class PetrolStationRunner {
    private static final int TOTAL_FUEL_AMOUNT = 2000;
    private static final int NUMBER_OF_THREADS = 8;

    public static void main(String[] args) {
        // Створюємо інстанс нашої АЗС
        PetrolStation station = new PetrolStation(TOTAL_FUEL_AMOUNT);
        // Реалізуємо ExecutorService через фіксований пул потоків у необхідній кількості
        ExecutorService service = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
        try {
            // У циклі виконуємо дію заправки у потоках.
            for (int i = 0; i <= NUMBER_OF_THREADS; i++) {
                final int requestedFuelAmount = ThreadLocalRandom.current().nextInt(30,401);
                service.submit(() -> station.doRefuel(requestedFuelAmount));
            }
        } finally {
            // Виконуємо завершення роботи сервісу після того як усі потоки відпрацювали.
            service.shutdown();
        }
    }
}
