package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.observer;

/*
Observer - паттерн, создающий механизм "подписки", позволяющий одним обьектам
следить и реагировать на события происходящие в других обьектах.
 */

public class Observer_Pattern_Main {
    public static void main(String[] args) {
        NotificationService observable = new NotificationService();

        Channel emailChannel = new EmailChannel();
        Channel pushChannel = new MobilePushChannel();

        observable.addObserver(emailChannel);
        observable.addObserver(pushChannel);

        observable.sendEvent("You have a job offer: Junior Java Developer!");

        observable.removeObserver(emailChannel);

        observable.sendEvent("Xfer Records Serum 2 30% Discount Voucher!");
    }
}
