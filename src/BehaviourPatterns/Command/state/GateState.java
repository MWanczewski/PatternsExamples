package BehaviourPatterns.Command.state;

public interface GateState {
    void pay(String cardNumber);
    boolean paymentOk();
    boolean enter();
}
