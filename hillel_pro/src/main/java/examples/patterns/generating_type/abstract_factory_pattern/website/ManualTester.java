package examples.patterns.generating_type.abstract_factory_pattern.website;

import examples.patterns.generating_type.abstract_factory_pattern.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
