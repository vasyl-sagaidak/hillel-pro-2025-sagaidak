package examples.patterns.generating_type.abstract_factory_pattern;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
