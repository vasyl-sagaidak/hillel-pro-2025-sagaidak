package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.visitor;

public class PlainTextExporterService implements DocumentVisitor {
    @Override
    public void visit(Paragraph paragraph) {
        System.out.println(paragraph.getText());
    }

    @Override
    public void visit(Image image) {
        System.out.println(image.getImagePath());
    }
}
