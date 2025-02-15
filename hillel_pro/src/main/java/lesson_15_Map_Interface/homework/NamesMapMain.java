package lesson_15_Map_Interface.homework;

public class NamesMapMain {
    public static void main(String[] args) {
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();
        uiOperator.getOutput(handler.getAll());
        uiOperator.getOutput(handler.getById(172));
    }
}
