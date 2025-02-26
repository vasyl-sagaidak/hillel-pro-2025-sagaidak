package lesson_16_Functional_Programming.paradigm_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableExample {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        List<String> immutableColors = Collections.unmodifiableList(colors);

        // Попытка изменить иммутабельный список приведет к исключению
        // immutableColors.add("Yellow");

        System.out.println("Неизменяемый список цветов: " + immutableColors);
    }
}
