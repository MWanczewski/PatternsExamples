package BehaviourPatterns.Command.state;

public class ClosedGateState implements GateState{
    boolean payment;
    @Override
    public void pay(String cardNumber) {
        if(cardNumber.startsWith("34")) {
            payment = true;
        } else {
            payment = false;
        }
    }

    @Override
    public boolean paymentOk() {
        return payment;
    }

    @Override
    public boolean enter() {
        return false;
    }
}
