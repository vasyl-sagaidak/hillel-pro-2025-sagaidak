package lesson_24_gof_patterns_01.livecoding_patterns.structural.adapter;

public class Adapter_Main {
    public static void main(String[] args) {
        Train train = new Train();
        Railway railway = new Railway();
        railway.add(train);

        CarAdapter carAdapter = new CarAdapter(new Car());
        railway.add(carAdapter);
    }
}
