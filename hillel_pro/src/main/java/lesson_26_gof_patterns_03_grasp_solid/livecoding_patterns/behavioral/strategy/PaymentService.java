package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.strategy;

public class PaymentService {
    PaymentStrategy paymentStrategy;

    public void checkout(int amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        }
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
