package examples.patterns.generating_type.abstract_factory_pattern;

import examples.patterns.generating_type.abstract_factory_pattern.banking.BankingTeamFactory;
import examples.patterns.generating_type.abstract_factory_pattern.Developer;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
