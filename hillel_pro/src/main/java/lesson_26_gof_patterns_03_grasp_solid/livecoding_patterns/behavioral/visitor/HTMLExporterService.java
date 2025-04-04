package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.visitor;

public class HTMLExporterService implements DocumentVisitor {
    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("<p>" + paragraph.getText() + "</p>");
    }

    @Override
    public void visit(Image image) {
        System.out.println("<img src='" + image.getImagePath() + "'/>");
    }
}
