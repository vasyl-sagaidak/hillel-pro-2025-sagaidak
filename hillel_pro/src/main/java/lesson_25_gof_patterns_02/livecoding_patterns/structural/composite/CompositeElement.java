package lesson_25_gof_patterns_02.livecoding_patterns.structural.composite;

import java.util.List;
import java.util.ArrayList;

public class CompositeElement implements Element {
    List<Element> elementList = new ArrayList<>();

    public CompositeElement(Element...elements) {
        elementList.addAll(List.of(elements));
    }

    @Override
    public int getPrice() {
        return elementList.stream()
                .map(Element::getPrice)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
