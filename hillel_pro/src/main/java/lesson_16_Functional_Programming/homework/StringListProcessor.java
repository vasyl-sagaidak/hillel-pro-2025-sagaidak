package lesson_16_Functional_Programming.homework;

public class StringListProcessor {
    static int countUpperCase(String s) {
        return s.replaceAll("[^A-Z]", "").length();
    }
}
