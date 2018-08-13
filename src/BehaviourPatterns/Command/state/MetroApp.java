package BehaviourPatterns.Command.state;

public class MetroApp {
    public static void main(String[] args) {
        Gate gate = new Gate();
        gate.enter();
        gate.pay("34453");
        gate.pay("34453");
        //System.out.println(gate.enter());
    }
}
