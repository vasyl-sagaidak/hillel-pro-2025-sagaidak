package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.mediator;

public class ChatUserService extends User {

    public ChatUserService(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(name + " sending" + message);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " receive" + message);
    }
}
