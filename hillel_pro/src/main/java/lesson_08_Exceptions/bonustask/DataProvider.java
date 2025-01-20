package lesson_08_Exceptions.bonustask;

import java.util.Scanner;

public class DataProvider {

    public int getTemperature() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature from -10 to 35: ");
        return sc.nextInt();
    }
}
