package examples.patterns.generating_type.abstract_factory_pattern.banking;

import examples.patterns.generating_type.abstract_factory_pattern.Developer;
import examples.patterns.generating_type.abstract_factory_pattern.ProjectManager;
import examples.patterns.generating_type.abstract_factory_pattern.ProjectTeamFactory;
import examples.patterns.generating_type.abstract_factory_pattern.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QAtester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
