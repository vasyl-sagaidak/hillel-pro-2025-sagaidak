package lesson_26_gof_patterns_03_grasp_solid.grasp_examples;

/*
В этом примере мы создаем абстракцию DataSource, защищающую класс DataService от изменений в реализации
источников данных. Класс DataService работает с абстракцией DataSource, а не с конкретными реализациями.
Когда мы изменяем источник данных из базы данных на внешний API, класс DataService остается неизменным.
 */

// Абстрактный класс абстракции для разных источников данных
interface DataSource {
    void fetchData();
}

// Конкретная реализация источника данных - база данных
class DatabaseDataSource implements DataSource {
    @Override
    public void fetchData() {
        System.out.println("Завантаження даних з бази даних...");
        // Реалізація для завантаження даних з бази даних
    }
}

// Конкретная реализация источника данных - внешний API
class ApiDataSource implements DataSource {
    @Override
    public void fetchData() {
        System.out.println("Запит на зовнішній API для отримання даних...");
        // Реалізація для запиту до зовнішнього API
    }
}

// Сервис, использующий источник данных через абстракцию
class DataService {
    private final DataSource dataSource;

    // Конструктор, принимающий инстанс абстракции источника данных
    public DataService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // Метод для получения данных
    public void fetchData() {
        // Виклик методу для отримання даних через абстракцію
        dataSource.fetchData();
    }
}

public class Grasp_ProtectedVariations_Principle {
    public static void main(String[] args) {
        // Создание обьекта базы данных как источника данных
        DataSource database = new DatabaseDataSource();

        // Создание сервиса, который использует базу данных
        DataService databaseService = new DataService(database);

        // Получение данных через сервис
        databaseService.fetchData();

        // Теперь изменяем источник данных на внешний API
        DataSource api = new ApiDataSource();
        databaseService = new DataService(api);

        // Снова получаем данные, но теперь через внешний API
        databaseService.fetchData();
    }
}
