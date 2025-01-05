package examples.patterns.generating_type.abstract_factory_pattern.banking;

import examples.patterns.generating_type.abstract_factory_pattern.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
