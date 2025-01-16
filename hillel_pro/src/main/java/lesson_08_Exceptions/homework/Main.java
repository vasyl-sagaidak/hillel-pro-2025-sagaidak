package lesson_08_Exceptions.homework;

import java.util.Scanner;

public class Main {

    static double balance;

    public static void main(String[] args) {
        balance = getBalance();
                validateAmount(balance, getAmount());
    }

    private static double getBalance() {
        return 1000.00; // Наявні кошти на рахунку
    }

    private static double getAmount() {
        System.out.printf("Balance is USD %.2f.%n" +
                "Enter purchase amount, USD: ", balance);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static void validateAmount(double balance, double withdrawal) {
        if (withdrawal > balance) {
            try {
                throw new FundsException ("Insufficent funds!");
            } catch (FundsException e) {
                System.out.println(e.getMessage());
            }
        } else {
            balance = getBalance(balance, withdrawal);
            System.out.printf("Funds are OK. Purchase paid." +
                    "%nBalance is USD %.2f", balance);
        }
    }

    private static double getBalance(double balance, double withdrawal) {
        return balance - withdrawal;
    }
}
