package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    String event;

    private final List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel) {
        channels.add(channel);
    }

    public void removeObserver(Channel channel) {
        channels.remove(channel);
    }

    public void sendEvent(String event) {
        for (Channel channel : channels) {
            channel.update(event);
        }
    }
}
