package lesson_13_Extended_Synchronization.extra_task;

public class Drink {
    private final int clientID;
    private final String drinkName;
    private final double drinkPrice;
    private Status drinkStatus = Status.PICKED;

    public Drink(Order order) {
        this.clientID = order.getClient().getClientID();
        this.drinkName = order.getChosenDrink().name();
        this.drinkPrice = order.getChosenDrink().getDrinkPrice();
        this.drinkStatus = order.getDrinkStatus();

    }

    public String getDrinkName() {
        return drinkName;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public Status getDrinkStatus() {
        return drinkStatus;
    }

    public int getClientID() {
        return clientID;
    }

    public void setDrinkStatus(Status drinkStatus) {
        this.drinkStatus = drinkStatus;
    }
}
