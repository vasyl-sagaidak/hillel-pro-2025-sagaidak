package lesson_24_gof_patterns_01.livecoding.structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        Train train = new Train();
        Railway railway = new Railway();
        railway.add(train);

        CarAdapter carAdapter = new CarAdapter(new Car());
        railway.add(carAdapter);
    }
}
