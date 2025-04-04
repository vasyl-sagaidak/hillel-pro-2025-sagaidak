package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.state;

public class UnlockedState implements TurnstileState {
    @Override
    public void insertCoin(Turnstile turnstileEntity) {
        System.out.println("Already unlocked. No need to insert another coin.");
    }

    @Override
    public void push(Turnstile turnstileEntity) {
        System.out.println("Pushed!. Locking turnstile.");
        turnstileEntity.setState(new LockedState());
    }
}
