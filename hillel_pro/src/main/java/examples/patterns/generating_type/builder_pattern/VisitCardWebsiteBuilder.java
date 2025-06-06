package examples.patterns.generating_type.builder_pattern;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Visit Card");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDRPESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
