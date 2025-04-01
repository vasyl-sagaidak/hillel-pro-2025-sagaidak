package lesson_25_gof_patterns_02.livecoding_patterns.structural.facade;

public class HDD {
    byte[] read(long lba, int size) {
        System.out.println("Reading data from LBA: " + lba + ", size: " + size);
        return new byte[size];
    }
}
