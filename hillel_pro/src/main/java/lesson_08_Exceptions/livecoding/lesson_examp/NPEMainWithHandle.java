package lesson_08_Exceptions.livecoding.lesson_examp;

//Пример NullPointerException с обработкой
public class NPEMainWithHandle {
    public static void main(String[] args) {
        String productName = "";
        //Создаем обьект магазина
        Store store = new Store();
        try {
            /*
            Предпринимаем попытку получения названия товара, который, ВОЗМОЖНО,
            должен быть в магазине, но , на самом деле его нет,
            поскольку обьект товара не был создан.
            Потому эта строка кода ДОЛЖНА выбросить NullPointerException
             */
            productName = store.getProduct().getName();
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        //Данный код выполнится, поскольку исключение обрабатывается,
        //но название товара не выводится.
        System.out.println("Product Name: " + productName);
    }
}
