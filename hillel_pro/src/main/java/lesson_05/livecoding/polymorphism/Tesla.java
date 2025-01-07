package lesson_05.livecoding.polymorphism;

public class Tesla extends Auto {
    @Override
    protected int getSpeed() {
        return 120; // робимо реалізацію абстрактного методу у нащадку
    }
}
