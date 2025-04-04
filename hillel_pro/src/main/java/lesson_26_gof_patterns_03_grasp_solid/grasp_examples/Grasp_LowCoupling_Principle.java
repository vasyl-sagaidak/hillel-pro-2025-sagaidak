package lesson_26_gof_patterns_03_grasp_solid.grasp_examples;

import java.util.ArrayList;
import java.util.List;

/*
В этом примере класс MessageService использует интерфейс MessageCreator для создания сообщения. Класс
MessageService не зависит напрямую от конкретных реализаций MessageCreator, что позволяет легко добавлять
новые типы сообщений без изменений в MessageService.
 */

// Интерфейс для создания сообщений
interface MessageCreator {
    String createMessage();
}

// Класс для создания приветственных сообщений
class GreetingMessageCreator implements MessageCreator {
    @Override
    public String createMessage() {
        return "Привіт!";
    }
}

// Класс для создания прощальных сообщений
class FarewellMessageCreator implements MessageCreator {
    @Override
    public String createMessage() {
        return "До побачення!";
    }
}

// Класс, использующий создатели сообщений
class MessageService {
    private List<MessageCreator> creators = new ArrayList<>();

    // Метод для добавления создателя сообщений
    public void addMessageCreator(MessageCreator creator) {
        creators.add(creator);
    }

    // Метод для отображения всех сообщений
    public void displayMessages() {
        for (MessageCreator creator : creators) {
            System.out.println(creator.createMessage());
        }
    }
}

public class Grasp_LowCoupling_Principle {
    public static void main(String[] args) {
        // Создание обьекта сервиса сообщений
        MessageService service = new MessageService();

        // Добавление создателей сообщений
        service.addMessageCreator(new GreetingMessageCreator());
        service.addMessageCreator(new FarewellMessageCreator());

        // Отображение всех сообщений
        service.displayMessages();
    }
}
