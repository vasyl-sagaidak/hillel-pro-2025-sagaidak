package lesson_24_gof_patterns_01.livecoding.structural.adapter;

public class CarAdapter extends Train {
    private Car car;

    public CarAdapter(Car car) {
        this.car = car;
    }

    @Override
    public void moveOnRails() {
        car.moveOnRoad();
    }
}
