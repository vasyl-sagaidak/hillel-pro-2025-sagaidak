package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.visitor;

public interface DocumentElement {
    void accept(DocumentVisitor visitor);
}
