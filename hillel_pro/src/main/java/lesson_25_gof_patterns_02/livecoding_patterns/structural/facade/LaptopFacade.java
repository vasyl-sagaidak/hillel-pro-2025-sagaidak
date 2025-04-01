package lesson_25_gof_patterns_02.livecoding_patterns.structural.facade;

public class LaptopFacade {
    private CPU cpu;
    private HDD hdd;
    private RAM ram;

    public LaptopFacade() {
        this.cpu = new CPU();
        this.hdd = new HDD();
        this.ram = new RAM();
    }

    public void startLaptop() {
        cpu.freeze();
        ram.load(0, hdd.read(1000,2300));
        cpu.jump(0);
        cpu.execute();
    }
}
