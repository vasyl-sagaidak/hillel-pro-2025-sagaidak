package lesson_24_gof_patterns_01.livecoding_patterns.structural.bridge;

public class TV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Turning ON on TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning OFF on TV");
    }
}
