package lesson_08_Exceptions.livecoding.lesson_examp;

//Пример возникновения NullPointerException
public class NPEMainNoHandle {
    public static void main(String[] args) {
        String productName;
        //Создаем обьект магазина
        Store store = new Store();
        /*
        Предпринимаем попытку получить название товара, который, ВОЗМОЖНО,
        должен быть в магазине, но, на самом деле его нет,
        поскольку обьект товара не создан.
        Потому эта строчка кода ДОЛЖНА выбросить NullPointerException
         */
        productName = store.getProduct().getName();
        //Этот код не выполнится, поскольку выбрасывается исключение.
        System.out.println("Product: " + productName);
    }
}

//Сущность товара.
class Product {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//Сущность магазина.
//В магазине ПЛАНИРУЕТСЯ наличие определенного товара.
class Store {
    private Product product;

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
}
