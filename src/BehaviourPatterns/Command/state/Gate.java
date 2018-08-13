package BehaviourPatterns.Command.state;

public class Gate {
    private GateState gateState = new ClosedGateState();
    public void pay(String creditCardNumber) {
        gateState.pay(creditCardNumber);
        if(gateState.paymentOk()) {
            gateState = new OpenGateState();
        }
    }
    public boolean enter() {
        if(gateState.paymentOk()) {
            gateState = new ClosedGateState();
            return true;
        }
        return false;
    }
}
