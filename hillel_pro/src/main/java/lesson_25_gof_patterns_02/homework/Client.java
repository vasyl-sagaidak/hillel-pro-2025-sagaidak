package lesson_25_gof_patterns_02.homework;

import lesson_25_gof_patterns_02.homework.abstraction.Transport;
import lesson_25_gof_patterns_02.homework.implementation.CarFactory;
import lesson_25_gof_patterns_02.homework.implementation.PlaneFactory;

import java.util.Arrays;

public class Client {
    public void run(String type) {
        if (type.equals("C")) {
            new CarFactory().createTransport().move();
        } else if (type.equals("P")) {
            new PlaneFactory().createTransport().move();
        } else {
            System.out.println("NOT A TYPE: Please specify correct transport type!");
        }
    }

    public static void main(String[] args) {
        String[] types = {"C", "P", "U"};
        Client client = new Client();
        Arrays.stream(types).forEach(client::run);
    }
}

 /*
    CAR: I'm moving along the road.
    PLANE: I'm flying above the skies.
    NOT A TYPE: Please specify correct transport type!

    Process finished with exit code 0
 */
