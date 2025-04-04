package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.observer;

public class MobilePushChannel implements Channel{
    @Override
    public void update(String event) {
        System.out.println("Mobile push channel got event " + event);
    }
}
