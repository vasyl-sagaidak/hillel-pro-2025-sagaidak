package lesson_26_gof_patterns_03_grasp_solid.solid_examples;

/*
В этом примере класс Notification зависит от абстракции MessageService, представляющей сервис отправки
сообщений. Класс Notification не зависит от конкретных реализаций этого сервиса, что позволяет легко
изменять реализацию в будущем без изменения класса Notification.
 */

// Абстракция, представляющая сервис отправки сообщений
interface MessageService {
    void sendMessage(String message);
}

// Класс, реализующий отправку сообщений по электронной почте
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Отправлено электронное письмо: " + message);
    }
}

// Класс, использующий сервис отправки сообщений
class Notification {
    private final MessageService messageService;

    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message) {
        messageService.sendMessage(message);
    }
}

public class DependencyInversionPrinciple_Solid {
    public static void main(String[] args) {
        // Создание экземпляра сервиса отправки сообщений по электронной почте
        MessageService emailService = new EmailService();

        // Передача сервиса отправки сообщений в класс Notification через конструктор
        Notification notification = new Notification(emailService);

        // Отправка сообщения через сервис отправки сообщений
        notification.sendNotification("Привет это тестовое сообщение!");
    }
}
