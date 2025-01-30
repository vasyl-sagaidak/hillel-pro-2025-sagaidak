package lesson_10_Java_IO.bonustask;

public class InfoReaderMain {
    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        String directory = "src\\main\\java\\lesson_10_Java_IO\\bonustask\\";
        String file = "info.txt";
        String content = handler.readFile(directory + file);
        getOutput("FILE CONTENT: " + content);
    }

    public static void getOutput(String message) {
        System.out.println(message);
    }
}
