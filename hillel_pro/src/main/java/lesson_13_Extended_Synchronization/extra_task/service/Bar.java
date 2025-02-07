package lesson_13_Extended_Synchronization.extra_task.service;

import lesson_13_Extended_Synchronization.extra_task.entity.Drink;
import lesson_13_Extended_Synchronization.extra_task.entity.Bartender;
import lesson_13_Extended_Synchronization.extra_task.entity.Client;

public class Bar {
    private Drink currentDrink;

    public void getOrder(Client client) {
        this.currentDrink = client.order();
    }

    public void prepareOrder(Bartender bartender) {
        bartender.prepare(currentDrink);

        throw new RuntimeException();
    }

    public Drink completeOrder() {
        throw new RuntimeException();
    }

}
