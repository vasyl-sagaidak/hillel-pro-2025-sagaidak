package lesson_13_Extended_Synchronization.extra_task;

public class Bartender implements Runnable {
    private final int bartenderID;
    private final Bar bar;

    public Bartender(int bartenderID, Bar bar) {
        this.bartenderID = bartenderID;
        this.bar = bar;
    }

    public int getBartenderID() {
        return bartenderID;
    }

    @Override
    public void run() {
        try {
            while(true) {
                Order order = bar.takeOrder();
                Drink preparedDrink = bar.prepareDrink(this, order);
                bar.provideDrink(this, preparedDrink);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
