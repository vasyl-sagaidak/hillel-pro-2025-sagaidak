package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.strategy;

public class CardPayment implements PaymentStrategy {
    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(" Paid $ " + amount
                + " using credit card: " + cardNumber);
    }
}
