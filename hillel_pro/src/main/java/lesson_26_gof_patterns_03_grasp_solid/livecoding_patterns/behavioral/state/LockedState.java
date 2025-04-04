package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.state;

public class LockedState implements TurnstileState {
    @Override
    public void insertCoin(Turnstile turnstileEntity) {
        System.out.println("Coin inserted: unlocking turnstile's gate");
        turnstileEntity.setState(new UnlockedState());
    }

    @Override
    public void push(Turnstile turnstileEntity) {
        System.out.println("Turnstile is locked. Can't push!");
    }
}
