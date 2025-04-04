package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.template_method;

public class JSONExporter extends DataExporter {
    @Override
    protected void openFile() {
        System.out.println("Opening JSON file...");
    }

    @Override
    protected void writeData() {
        System.out.println("Writing data in JSON format.");
    }

    @Override
    protected void closeFile() {
        System.out.println("Closing JSON file.");
    }
}
