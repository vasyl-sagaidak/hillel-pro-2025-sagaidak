package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.strategy;

public class CashPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using cash.");
    }
}
