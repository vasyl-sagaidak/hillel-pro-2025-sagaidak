package lesson_13_Extended_Synchronization.extra_task;

public class Order {
    private final Client client;
    private final Menu chosenDrink;
    private Status drinkStatus;

    public Order(Client client, Menu chosenDrink) {
        this.client = client;
        this.chosenDrink = chosenDrink;
        this.drinkStatus = Status.ORDERED;
    }

    public Client getClient() {
        return client;
    }

    public Status getDrinkStatus() {
        return drinkStatus;
    }

    public void setStatus(Status drinkStatus) {
        this.drinkStatus = drinkStatus;
    }

    public Menu getChosenDrink() {
        return chosenDrink;
    }
}
