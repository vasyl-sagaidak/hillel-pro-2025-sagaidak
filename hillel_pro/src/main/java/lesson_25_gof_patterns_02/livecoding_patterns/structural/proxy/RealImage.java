package lesson_25_gof_patterns_02.livecoding_patterns.structural.proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // Подразумеваем что метод display - тяжелая операция
        System.out.println("Displayed image " + fileName);
    }
}
