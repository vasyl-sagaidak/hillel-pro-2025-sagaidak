package lesson_26_gof_patterns_03_grasp_solid.grasp_examples;

/*
В этом примере класс ProductFactory является создателем экземпляров класса Product.
Он имеет метод createProduct, создающий новый экземпляр товара с заданными параметрами.
Использование такой фабрики позволяет изолировать процесс создания объектов клиентского кода
и облегчает расширение системы.
 */

// Класс, представляющий товар
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Класс-создатель, создающий экземпляр класса Product
class ProductFactory {
    public static Product createProduct(String name, double price) {
        return new Product(name, price);
    }
}

public class Grasp_Creator_Principle {
    public static void main(String[] args) {
        // Создание товара с помощью фабрики
        Product product = ProductFactory.createProduct("Мобільний телефон", 1500.0);

        // Вывод информации о товаре
        System.out.println("Назва товару: " + product.getName());
        System.out.println("Ціна товару: " + product.getPrice() + " грн");
    }
}
