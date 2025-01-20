package lesson_08_Exceptions.bonustask;

public class TemperatureException extends RuntimeException {

    public TemperatureException(String message) {
        super(message);
    }
}
