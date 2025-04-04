package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.mediator;

public interface ChatMediator {
    void sendMessage(String message, User user);

    void addUser(User user);
}
