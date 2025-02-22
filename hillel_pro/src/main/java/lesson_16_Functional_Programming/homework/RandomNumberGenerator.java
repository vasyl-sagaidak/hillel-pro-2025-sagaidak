package lesson_16_Functional_Programming.homework;

import java.security.SecureRandom;

public class RandomNumberGenerator {
    public static int generateRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException(
                    "Min value can't be bigger than max value");
        }
        SecureRandom random = new SecureRandom();
        return random.nextInt((max - min) + 1) + min;
    }
}
