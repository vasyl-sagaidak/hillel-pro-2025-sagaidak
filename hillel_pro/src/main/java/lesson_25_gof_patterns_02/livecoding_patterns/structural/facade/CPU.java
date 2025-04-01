package lesson_25_gof_patterns_02.livecoding_patterns.structural.facade;

public class CPU {
    void freeze() {
        System.out.println("CPU frozen");
    }

    void jump(long position) {
        System.out.println("CPU jumps to position " + position);
    }

    void execute() {
        System.out.println("CPU executing instructions");
    }
}
