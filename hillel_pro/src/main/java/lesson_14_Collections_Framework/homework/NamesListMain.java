package lesson_14_Collections_Framework.homework;

public class NamesListMain {
    public static void main(String[] args) {
        DataRepository repository = new DataRepository();
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();
        uiOperator.getOutput(handler.formListOutput(repository.getData()));
        uiOperator.getOutput(handler.formOutput(repository.getData(), 2));
    }
}
