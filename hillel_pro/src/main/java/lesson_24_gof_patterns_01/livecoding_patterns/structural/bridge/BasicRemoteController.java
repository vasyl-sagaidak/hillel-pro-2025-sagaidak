package lesson_24_gof_patterns_01.livecoding_patterns.structural.bridge;

public class BasicRemoteController extends RemoteControl {
    public BasicRemoteController(Device device) {
        super(device);
    }

    @Override
    void powerOn() {
        System.out.println("Basic Remote: ");
        device.turnOn();
    }

    @Override
    void powerOff() {
        System.out.println("Basic Remote: ");
        device.turnOff();
    }
}
