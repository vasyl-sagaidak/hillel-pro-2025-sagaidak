package lesson_24_gof_patterns_01.livecoding_patterns.creational.factory_method;

public class InMemoryStorage implements DataStorage{
    @Override
    public void store(String data) {
        // -- Логика записи данных в какую-то коллекцию --
        System.out.println(data);
    }
}
