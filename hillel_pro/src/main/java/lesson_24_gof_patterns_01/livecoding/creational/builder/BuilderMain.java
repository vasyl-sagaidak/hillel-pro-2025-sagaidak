package lesson_24_gof_patterns_01.livecoding.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder() // Вызов без статического метода build() возращающего билдер
                .withTopping("Cherry")
                .withCheese("Camamber")
                .build();

        Pizza pizza1 = Pizza.builder() // вызов через этот метод в случае его создания
                .withCheese("Parmesan")
                .withSauce("Barbecue")
                .withMushrooms("Shampegnion")
                .build();
    }
}
