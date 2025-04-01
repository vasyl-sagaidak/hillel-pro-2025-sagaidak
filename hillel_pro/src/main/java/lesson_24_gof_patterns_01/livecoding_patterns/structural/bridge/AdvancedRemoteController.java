package lesson_24_gof_patterns_01.livecoding_patterns.structural.bridge;

public class AdvancedRemoteController extends RemoteControl {
    public AdvancedRemoteController(Device device) {
        super(device);
    }

    @Override
    void powerOn() {
        System.out.println("Advanced Remote: ");
        device.turnOn();
    }

    @Override
    void powerOff() {
        System.out.println("Advanced Remote: ");
        device.turnOff();
    }
}
