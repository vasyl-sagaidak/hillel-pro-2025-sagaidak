package lesson_13_Extended_Synchronization.homework;

public class LockerAppMain {
    public static void main(String[] args) {
        int[] numbers = new DataRepository().getData();
        DataHandler dataHandler = new DataHandler();
        for (int num : numbers) {
            System.out.println("Initial value is " + num);
            int newNum = dataHandler.modify(num);
            System.out.println("New value is " + newNum);
        }
    }
}
