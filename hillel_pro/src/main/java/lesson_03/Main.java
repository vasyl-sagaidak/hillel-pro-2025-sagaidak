package lesson_03;

import lesson_03.service.TempConversionService;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to C to F converter.");
        System.out.println("Please specify CELSIUS value to convert:");

        double value = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("#.#");
        double fahrenheit = TempConversionService.toFahrenheit(value);
        System.out.println("Result of conversion: from [" + value
                + " C], is [" + df.format(fahrenheit) + " F]");
        if (fahrenheit <= 32.0) {
            System.out.println(" ");
            System.out.println("Thanks for FREEZING with us!");
        }
    }
}