package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.state;

public class Turnstile {
    private TurnstileState state;

    public Turnstile() {
        state = new LockedState();
    }

    public void setState(TurnstileState state) {
        this.state = state;
    }

    public void insertCoin() {
        state.insertCoin(this);
    }

    public void pushTheButton() {
        state.push(this);
    }
}
