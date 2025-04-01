package lesson_25_gof_patterns_02.livecoding_patterns.structural.composite;

public class Product implements Element {
    private int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
