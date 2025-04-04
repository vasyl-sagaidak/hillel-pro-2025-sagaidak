package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.strategy;

/*
Strategy - паттерн, определяющий семейство подобных алгоритмов и помещает каждый из
них в свой класс, после чего, алгоритмы можно взаимозаменять непосредственно во
время выполнения программы.
 */

public class Strategy_Pattern_Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.setPaymentStrategy(new CardPayment("4149-5263-7901-XX07"));
        paymentService.checkout(44);

        paymentService.setPaymentStrategy(new CashPayment());
        paymentService.checkout(25);

        paymentService.setPaymentStrategy(new RevolutPayment("Kartius"));
        paymentService.checkout(33);
    }
}
