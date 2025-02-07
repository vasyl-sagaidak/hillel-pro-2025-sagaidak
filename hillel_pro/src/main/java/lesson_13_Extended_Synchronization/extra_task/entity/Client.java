package lesson_13_Extended_Synchronization.extra_task.entity;

import lesson_13_Extended_Synchronization.extra_task.Drinks;
import lesson_13_Extended_Synchronization.extra_task.Status;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Client implements Runnable {
    private static final int BOUND_RANGE = 25;
    private String name;
    private int id;
    private final List<Drinks> drinksList;
    private Drink currentDrink;
    private double subtotal;

    public Client(String name, int id) {
        this.name = name;
        this.id = id;
        drinksList = new ArrayList<>();
    }

   private void makeChoice() {
        this.drinksList.add(Drinks.values()[new SecureRandom().nextInt(BOUND_RANGE)]);
        currentDrink = new Drink(
                drinksList.getLast().name(), drinksList.getLast().getPrice(),
                Status.ORDERED);
    }

    public Drink order() {
        makeChoice();
        this.subtotal += currentDrink.getPrice();
        return currentDrink;
    }

    public Drink getCurrentDrink() {
        return currentDrink;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void printTotalBill() {
        if (!drinksList.isEmpty()) {
            for (int i = 0; i < drinksList.size(); i++) {
                System.out.println(i + ": "
                        + drinksList.get(i).name().toLowerCase()
                        + ". Price: "
                        + drinksList.get(i).getPrice() + " Euro");
            }
            System.out.println("SUB-TOTAL: " + subtotal);
        }
    }

    @Override
    public void run() {
        order();

    }
}
