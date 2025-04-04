package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.visitor;

public class Image implements DocumentElement {
    private String imagePath;

    public Image(String imagePath) {
        this.imagePath = imagePath;
    }


    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

    public String getImagePath() {
        return imagePath;
    }
}
