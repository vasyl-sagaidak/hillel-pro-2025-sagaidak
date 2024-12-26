package lesson_03.service;

public class TempConversionService {
    private static final double TEMP_DIFF = 32.0;
    private static final double ABS_MIN_CELS = -273.15;
    private static final double ABS_MIN_FAHR = -459.67;

    public static double toFahrenheit(double celsius) {
        if (celsius <= ABS_MIN_CELS) {
            System.out.println("You've reachet absolute ZERO temperature in CELSIUS SCALE.\n" +
                    "Atoms are stuck.\n" +
                    "No more life as we know it.");
        }
        return celsius * 9 / 5 + TEMP_DIFF;
    }

    public static double toCelsius(double fahrenheit) {
        if (fahrenheit <= ABS_MIN_FAHR) {
            System.out.println("You've reachet absolute ZERO temperature in FAHRENHEIT SCALE.\n" +
                    "Atoms are stuck.\n" +
                    "No more life as we know it.");
        }

        return (fahrenheit - TEMP_DIFF) * 5 / 9;
    }
}