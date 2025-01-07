package lesson_05.livecoding.inheritance;

public class Vehicle {

    protected int i;

    public Vehicle() {
        System.out.println("In Vehicle constructor");
    }

    public Vehicle(int i) {
        this.i = i;
        System.out.println("Vehicle with param");
    }

    protected void something() {
        System.out.println("Vehicle method");
    }
}
