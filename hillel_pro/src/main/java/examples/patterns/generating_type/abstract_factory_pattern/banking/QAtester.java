package examples.patterns.generating_type.abstract_factory_pattern.banking;

import examples.patterns.generating_type.abstract_factory_pattern.Tester;

public class QAtester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking code...");
    }
}
