package lesson_05.livecoding.inheritance;

public class Bike extends Vehicle {

    public Bike() {
        super(4);
        System.out.println("In Bike constructor");
       // int i = super.i;
    }

    @Override
    protected void something() {
        super.something();
        System.out.println("Bike");
    }
}
