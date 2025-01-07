package lesson_05.livecoding.polymorphism;

public class Main {
    public static void main(String[] args) {
        // Виклик методу displayCurrentSpeed у об'єкта tesla.
        Tesla tesla = new Tesla();
        tesla.displayCurrentSpeed();

        // Приклад Anonymous вкладеного класу
        Auto auto = new Auto() {
            @Override
            protected int getSpeed() {
                return 15;
            }
        };
        auto.displayCurrentSpeed(); // виклик методу displayCurrentSpeed у об'єкта (анонімного класу) auto.
    }
}
