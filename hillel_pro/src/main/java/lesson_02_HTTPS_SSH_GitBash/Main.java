package lesson_02_HTTPS_SSH_GitBash;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static final double NAUTICAL_MILE = 1.852;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose conversion method:");
        System.out.println("[0] - NM to KM || KM to NM - [1]");
        int conversionMethod = sc.nextInt();
        if (conversionMethod == 0) {
            System.out.println("Nautical Miles to Kilometers converter is invoked!");
            System.out.println("~ * ~ * ~ * ~ * ~ * ~ * ~ * ~ ");
            System.out.println("Please specify your MILES value to convert:");
            double miles = sc.nextDouble();
            if (miles <= 0) {
                System.out.println("Please provide positive value");
                miles = sc.nextDouble();
            }
                double result = milesToKilometers(miles);
            System.out.println(" ");
                System.out.println("[" + (int) miles + " miles] == [" + result + " km]");
            System.out.println(" ");
            System.out.println(" ~ * ~ ThE EnD ~ * ~");


        } else {
            System.out.println("Kilometers to Nautical Miles converter is invoked!");
            System.out.println("~ * ~ * ~ * ~ * ~ * ~ * ~ * ~ ");
            System.out.println("Please specify your KILOMETERS value to convert:");
            double kilometers = sc.nextDouble();
            double result = kilometersToMiles(kilometers);
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println(" ");
            System.out.println("[" + (int) kilometers + " km] == ["
                    + df.format(result) + " nautical miles]");
            System.out.println(" ");
            System.out.println(" ~ * ~ ThE EnD ~ * ~");
        }
    }

    public static double milesToKilometers(double miles) {
        return miles * NAUTICAL_MILE;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers / NAUTICAL_MILE;
    }
}
