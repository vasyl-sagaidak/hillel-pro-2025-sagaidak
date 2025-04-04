package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.mediator;

public abstract class User {
    protected ChatMediator chatMediator;
    protected String name;

    public User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}
