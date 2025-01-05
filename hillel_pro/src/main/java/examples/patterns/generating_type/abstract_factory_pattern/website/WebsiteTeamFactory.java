package examples.patterns.generating_type.abstract_factory_pattern.website;

import examples.patterns.generating_type.abstract_factory_pattern.Developer;
import examples.patterns.generating_type.abstract_factory_pattern.ProjectManager;
import examples.patterns.generating_type.abstract_factory_pattern.ProjectTeamFactory;
import examples.patterns.generating_type.abstract_factory_pattern.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
