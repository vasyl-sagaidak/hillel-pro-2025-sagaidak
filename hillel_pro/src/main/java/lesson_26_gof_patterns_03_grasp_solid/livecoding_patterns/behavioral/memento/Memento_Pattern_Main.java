package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.memento;

/*
Memento - паттерн, позволяющий делать "снимки" состояния обьектов не раскрывая
          подробностей их реализации.
Потом, можно использовать эти "снимки" что бы вернуться (откатиться) к предыдущему состоянию обьекта.
Своего рода аналог CTRL + Z, только с состоянием обьекта в JAVA.
 */

public class Memento_Pattern_Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.type("First word");
        history.store(editor);

        editor.type("Second word");
        history.store(editor);

        editor.type("Third word");

        System.out.println("Current state: " + editor.getContent());

        history.undo(editor);

        System.out.println("After undo state: " + editor.getContent());


    }
}
