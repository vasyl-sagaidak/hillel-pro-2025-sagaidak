package examples.patterns.generating_type.builder_pattern;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website website = director.buildWebsite();
        System.out.println(website);
    }
}
