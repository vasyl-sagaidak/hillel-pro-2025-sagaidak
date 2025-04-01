package lesson_24_gof_patterns_01.livecoding_patterns.structural.bridge;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    abstract void powerOn();

    abstract void powerOff();
}
