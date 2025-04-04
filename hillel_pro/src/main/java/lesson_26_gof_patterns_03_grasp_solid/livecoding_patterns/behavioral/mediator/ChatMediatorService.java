package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorService implements ChatMediator{
    private final List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User sender) {
        for (User currentUser : users) {
            if (currentUser != sender) {
                currentUser.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
