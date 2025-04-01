package lesson_24_gof_patterns_01.livecoding_patterns.structural.bridge;

public class Bridge_Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl tvRemoteController = new BasicRemoteController(tv);
        tvRemoteController.powerOn();
        tvRemoteController.powerOff();

        RemoteControl radioRemoteController = new AdvancedRemoteController(radio);
        radioRemoteController.powerOn();
        radioRemoteController.powerOff();
    }
}
