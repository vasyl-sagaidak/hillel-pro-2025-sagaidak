package lesson_25_gof_patterns_02.homework.model;

import lesson_25_gof_patterns_02.homework.abstraction.Transport;

public class Plane implements Transport {
    @Override
    public void move() {
        System.out.println("PLANE: I'm flying above the skies.");
    }
}
