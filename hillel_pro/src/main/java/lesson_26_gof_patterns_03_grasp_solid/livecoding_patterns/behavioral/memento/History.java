package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.memento;

import java.util.Stack;

public class History {
    private final Stack<EditorMemento> mementos = new Stack<>();

    public void store(Editor editor) {
        mementos.push(editor.save());
    }

    public void undo(Editor editor) {
        if (!mementos.isEmpty()) {
            editor.restore(mementos.pop());
        }
    }
}
