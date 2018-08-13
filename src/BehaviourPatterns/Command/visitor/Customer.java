package BehaviourPatterns.Command.visitor;

public interface Customer {
    String getName();
    void accept(Taxi taxi);
}
