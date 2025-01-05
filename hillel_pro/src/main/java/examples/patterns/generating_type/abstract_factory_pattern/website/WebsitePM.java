package examples.patterns.generating_type.abstract_factory_pattern.website;

import examples.patterns.generating_type.abstract_factory_pattern.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
