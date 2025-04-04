package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.state;

/*
State - паттерн, позволяющий обьектам изменять поведение в зависимости от своего
состояния. Снаружи (вне имплементации) возникает впечатление, что сменился класс обьекта.
 */
public class State_Pattern_Main {
    public static void main(String[] args) {
        Turnstile turnstile = new Turnstile();

        turnstile.pushTheButton();

        turnstile.insertCoin();

        turnstile.pushTheButton();
    }
}
