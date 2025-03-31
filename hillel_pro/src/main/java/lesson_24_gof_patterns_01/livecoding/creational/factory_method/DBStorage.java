package lesson_24_gof_patterns_01.livecoding.creational.factory_method;

public class DBStorage implements DataStorage{
    @Override
    public void store(String data) {
        // -- Логика записи данных в базу --
        System.out.println(data);
    }
}
