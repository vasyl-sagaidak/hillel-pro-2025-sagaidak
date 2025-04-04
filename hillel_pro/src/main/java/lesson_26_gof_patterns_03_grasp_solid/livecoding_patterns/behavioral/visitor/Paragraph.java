package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.visitor;

public class Paragraph implements DocumentElement {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }


    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

    public String getText() {
        return text;
    }
}
