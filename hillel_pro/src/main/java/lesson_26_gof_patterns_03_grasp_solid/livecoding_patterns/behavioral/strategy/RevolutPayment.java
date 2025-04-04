package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.strategy;

public class RevolutPayment implements PaymentStrategy {
    private String accountName;

    public RevolutPayment(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount
                + " using Revolut Wallet name: " + accountName);
    }
}
