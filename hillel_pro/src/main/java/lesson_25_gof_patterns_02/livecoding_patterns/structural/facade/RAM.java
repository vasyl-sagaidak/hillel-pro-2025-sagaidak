package lesson_25_gof_patterns_02.livecoding_patterns.structural.facade;

public class RAM {

    void load(long position, byte[] data) {
        System.out.println("Loading data at position " + position);
    }
}
