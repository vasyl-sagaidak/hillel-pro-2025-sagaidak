package lesson_11_Java_NIO.bonustask;

public class TextReaderMain {

    public static void main(String[] args) {
        TextReaderFileHandler handler = new TextReaderFileHandler();
        String path = "src/main/java/lesson_11_Java_NIO/bonustask/files/info.txt";
        getOutput("FILE CONTENT: " + handler.readFromFile(path));
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
