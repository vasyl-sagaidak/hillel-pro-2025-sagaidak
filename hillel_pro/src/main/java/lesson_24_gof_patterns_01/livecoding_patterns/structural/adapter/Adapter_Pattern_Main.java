package lesson_24_gof_patterns_01.livecoding_patterns.structural.adapter;

/*
ADAPTER (АДАПТЕР):
           -> Конвертирует интерфейс класса в другой интерфейс, ожидаемый клиентом.
              Позволяет классам с разными интерфейсами работать вместе.
 */

public class Adapter_Pattern_Main {
    public static void main(String[] args) {
        Train train = new Train();
        Railway railway = new Railway();
        railway.add(train);

        CarAdapter carAdapter = new CarAdapter(new Car());
        railway.add(carAdapter);
    }
}
