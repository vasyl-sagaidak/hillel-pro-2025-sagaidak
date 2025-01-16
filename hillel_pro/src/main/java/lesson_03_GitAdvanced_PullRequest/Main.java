package lesson_03_GitAdvanced_PullRequest;

import lesson_03_GitAdvanced_PullRequest.service.TempConversionService;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Temperature converter.");
        System.out.println("Please pick one of the following conversion methods:");
        System.out.println("[0] - Celsius ==> Fahrenheit");
        System.out.println("[1] - Fahrenheit ==> Celsius");

        boolean noChoice = true;
        int conversionMethod = sc.nextInt();

        while(noChoice) {
            if (conversionMethod == 0 || conversionMethod == 1) {
                noChoice = false;
            } else {
                System.out.println("Incorrect input. Please try again.");
                conversionMethod = sc.nextInt();
            }
        }
        if (conversionMethod == 0) {
            System.out.println("Please specify CELSIUS value to convert:");
        } else {
            System.out.println("Please specify FAHRENHEIT value to convert:");
        }

        double value = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("#.#");
        if (conversionMethod == 0) {
            double fahrenheit = TempConversionService.toFahrenheit(value);
            System.out.println("Result of conversion: from [" + value
                    + " C], is [" + df.format(fahrenheit) + " F]");
            if (fahrenheit <= 32.0) {
                System.out.println(" ");
                System.out.println("Thanks for FREEZING with us!");
            }
        } else {
            double celsius = TempConversionService.toCelsius(value);
            System.out.println("Result of conversion: from [" + value
                    + " F], is [" + df.format(celsius) + " C]");
            if (celsius <= 0.0) {
                System.out.println(" ");
                System.out.println("Thanks for FREEZING with us!");
            }
        }
    }
}