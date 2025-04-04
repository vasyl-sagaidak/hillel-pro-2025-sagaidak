package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.visitor;

public interface DocumentVisitor {
    void visit(Paragraph paragraph);

    void visit(Image image);
}
