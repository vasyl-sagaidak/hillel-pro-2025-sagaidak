package examples.enums;

public enum Temperatures {
    SUNNY(35),
    RAINY(22),
    WINDY(28),
    FREEZY(-5),
    FOGGY(16);

    private Temperatures(int temperature) {
        this.temperature = temperature;
    }

    private final int temperature;

    public int getTemperature() {
        return temperature;
    }
}
