package lesson_04.buyer_info;

public class Main {
    public static void main(String[] args) {
        OuputFormatter of = new OuputFormatter();
        getOutput(of.getOutputData(getBuyer(getData())));
    }

    public static String[] getData() {
        return new String[] {"Alice", "Terra", "555-123-8596"};
    }

    public static Buyer getBuyer(String[] data) {
        return new Buyer(data[0], data[1], data[2]);
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
