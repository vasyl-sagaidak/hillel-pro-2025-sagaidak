package lesson_25_gof_patterns_02.livecoding_patterns.structural.facade;

public class Facade_Main {
    public static void main(String[] args) {
        LaptopFacade laptopFacade = new LaptopFacade();
        laptopFacade.startLaptop();
    }
}
