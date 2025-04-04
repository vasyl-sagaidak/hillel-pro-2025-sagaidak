package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.state;

public interface TurnstileState {
    void insertCoin(Turnstile turnstileEntity);

    void push(Turnstile turnstileEntity);

}
