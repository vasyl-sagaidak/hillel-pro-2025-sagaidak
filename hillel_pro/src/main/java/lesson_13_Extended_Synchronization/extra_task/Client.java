package lesson_13_Extended_Synchronization.extra_task;

import java.util.concurrent.locks.ReentrantLock;

public class Client implements Runnable {
    private final ReentrantLock lock = new ReentrantLock();
    private final int clientID;
    private final Bar bar;
    private double totalSpent;

    public Client(int clientID, Bar bar) {
        this.clientID = clientID;
        this.bar = bar;
    }

    public int getClientID() {
        return clientID;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

    public void addPrice(double cocktailsPrice) {
        this.totalSpent += cocktailsPrice;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                Menu chosenDrink = Menu.getRandomDrink();
                System.out.println("Client " + clientID + " wants to order " + chosenDrink.name());
                bar.putOrder(this, chosenDrink);
                bar.takeDrink(this,chosenDrink);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Client " + clientID + " total spent for drinks: $" + totalSpent);
    }
}
