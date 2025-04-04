package lesson_25_gof_patterns_02.livecoding_patterns.structural.facade;

/*
FACADE (ФАСАД):
           -> Предоставляет единый интерфейс к группе интерфейсов подсистемы. Определяет
              высокоуровневый интерфейс, делая подсистему проще для использования.
 */

public class Facade_Pattern_Main {
    public static void main(String[] args) {
        LaptopFacade laptopFacade = new LaptopFacade();
        laptopFacade.startLaptop();
    }
}
