package lesson_25_gof_patterns_02.homework.model;

import lesson_25_gof_patterns_02.homework.abstraction.Transport;

public class Car implements Transport {
    @Override
    public void move() {
        System.out.println("CAR: I'm moving along the road.");
    }
}
