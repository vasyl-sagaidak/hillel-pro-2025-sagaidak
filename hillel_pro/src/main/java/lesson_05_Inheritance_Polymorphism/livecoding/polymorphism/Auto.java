package lesson_05_Inheritance_Polymorphism.livecoding.polymorphism;

public abstract class Auto {

    //В нас є імплементація яка використовує абстракцію,
    // наш абстрактний метод getSpeed() передано як аргумент на вхід методу displayCurrentSpeed(),
    // тож ми зробили часткове делегування імплементації своїм наслідникам.

    protected void displayCurrentSpeed() {
        System.out.println(getSpeed());
    }

    protected abstract int getSpeed();
}
