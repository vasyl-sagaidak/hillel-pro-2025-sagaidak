package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.memento;

public class EditorMemento {
    private final String state;

    public EditorMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}