package lesson_07.homework;

public class Main {

    public static void main(String[] args) {
        Corrector corrector = new Corrector();
        getOutput(corrector.handleData(new DataProvider().getData()));
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
