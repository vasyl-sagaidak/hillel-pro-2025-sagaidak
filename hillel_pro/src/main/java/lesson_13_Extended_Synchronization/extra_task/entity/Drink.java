package lesson_13_Extended_Synchronization.extra_task.entity;

import lesson_13_Extended_Synchronization.extra_task.Status;

public class Drink {
    private final String name;
    private final double price;
    private Status currentStatus; // ordered, prepared, ready;

    public Drink(String name, double price, Status status) {
        this.name = name;
        this.price = price;
        this.currentStatus = status;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Status getStatus() {
        return currentStatus;
    }

    public void setStatus(Status currentStatus) {
        this.currentStatus = currentStatus;
    }
}
