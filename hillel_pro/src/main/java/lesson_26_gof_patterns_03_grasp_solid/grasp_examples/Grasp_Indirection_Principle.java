package lesson_26_gof_patterns_03_grasp_solid.grasp_examples;

/*
В этом примере класс Client использует сервис через интерфейс Service, позволяющий отделить класс-клиент от
конкретной реализации сервиса ConcreteService. Это делает код более гибким и упрощает изменение реализации
сервиса без внесения изменений в класс-клиент.
 */

// Интерфейс для сервиса
interface Service {
    void performAction();
}

// Реализация сервиса
class ConcreteService implements Service {
    @Override
    public void performAction() {
        System.out.println("Виконання дії в конкретному сервісі.");
    }
}

// Класс, использующий сервис через интерфейс
class Client {
    private final Service service;

    // Конструктор, получающий интерфейс сервиса через параметр
    public Client(Service service) {
        this.service = service;
    }

    // Метод для вызова действия сервиса через интерфейс
    public void doAction() {
        System.out.println("Виклик дії через інтерфейс.");
        service.performAction();
    }
}

public class Grasp_Indirection_Principle {
    public static void main(String[] args) {
        // Создание конкретного сервиса
        ConcreteService concreteService = new ConcreteService();

        // Создание клиента, который использует сервис через интерфейс
        Client client = new Client(concreteService);

        // Вызов действия клиентом через интерфейс
        client.doAction();
    }
}
