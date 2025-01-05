package examples.patterns.generating_type.abstract_factory_pattern.banking;

import examples.patterns.generating_type.abstract_factory_pattern.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
