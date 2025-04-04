package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.template_method;

public abstract class DataExporter {

    public final void export() {
        openFile();
        writeData();
        closeFile();
    }

    protected abstract void openFile();

    protected abstract void writeData();

    protected abstract void closeFile();
}
