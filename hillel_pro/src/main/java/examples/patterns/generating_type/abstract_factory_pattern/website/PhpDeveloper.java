package examples.patterns.generating_type.abstract_factory_pattern.website;

import examples.patterns.generating_type.abstract_factory_pattern.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PhP developer writes PHP code...");
    }
}
