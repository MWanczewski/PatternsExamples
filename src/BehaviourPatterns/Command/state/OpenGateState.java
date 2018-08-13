package BehaviourPatterns.Command.state;

public class OpenGateState implements GateState {

    @Override
    public void pay(String cardNumber) {
        System.out.println("Zaplacono już wczesniej");
    }

    @Override
    public boolean paymentOk() {
        return true;
    }

    @Override
    public boolean enter() {
        return true;
    }
}
