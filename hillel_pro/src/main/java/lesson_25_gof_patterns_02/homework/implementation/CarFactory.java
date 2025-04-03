package lesson_25_gof_patterns_02.homework.implementation;

import lesson_25_gof_patterns_02.homework.abstraction.Transport;
import lesson_25_gof_patterns_02.homework.abstraction.TransportFactory;
import lesson_25_gof_patterns_02.homework.model.Car;

public class CarFactory extends TransportFactory {

    @Override
    public Transport createTransport() {
        return new Car();
    }
}
