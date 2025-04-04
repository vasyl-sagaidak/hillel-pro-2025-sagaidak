package lesson_26_gof_patterns_03_grasp_solid.grasp_examples;

/*
В этом примере класс DataProcessor представляет собой чистую выдумку, которая не имеет прямого отображения
на реальный объект, но обеспечивает функциональность обработки и хранения данных в базе данных. Это позволяет
отделить логику обработки данных от логики доступа к базе данных и упрощает тестирование и развитие программы.
 */

// Класс для работы с базой данных
class DatabaseService {
    // Метод для сохранения данных в базе
    public void saveData(Object data) {
        // Логика сохранения данных в базе
        System.out.println("Дані успішно збережено у базі даних.");
    }
}

// Pure Fabrication класс для обработки данных
class DataProcessor {
    // Ссылка на сервис базы данных
    private DatabaseService databaseService;

    // Конструктор, инициализирующий ссылку на сервис базы данных
    public DataProcessor(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    // Метод для обработки и сохранения данных
    public void processData(Object data) {
        // Логика обработки данных
        System.out.println("Дані успішно оброблено.");

        // Сохранение обработанных данных в базу
        databaseService.saveData(data);
    }
}

public class Grasp_PureFabrication_Principle {
    public static void main(String[] args) {
        // Создание сервиса базы данных
        DatabaseService databaseService = new DatabaseService();

        // Создание Pure Fabrication обьекта для обработки данных
        DataProcessor dataProcessor = new DataProcessor(databaseService);

        // Создание данных для обработки
        Object data = new Object();

        // Обработка и сохранение данных
        dataProcessor.processData(data);
    }
}
