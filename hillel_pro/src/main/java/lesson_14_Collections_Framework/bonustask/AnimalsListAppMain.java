package lesson_14_Collections_Framework.bonustask;

public class AnimalsListAppMain {
    public static void main(String[] args) {
        DataRepository repo = new DataRepository();
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();
        uiOperator.getOutput(handler.formListOutput(repo.getData()));
        uiOperator.getOutput(handler.formOutput(repo.getData(),3));
    }
}
