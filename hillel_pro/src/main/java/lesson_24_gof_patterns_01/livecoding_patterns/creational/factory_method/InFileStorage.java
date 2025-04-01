package lesson_24_gof_patterns_01.livecoding_patterns.creational.factory_method;

public class InFileStorage implements DataStorage{
    @Override
    public void store(String data) {
        // -- Логика записи данных в файл --
        System.out.println(data);
    }
}
