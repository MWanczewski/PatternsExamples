package BehaviourPatterns.Command.visitor;

public class VisitorMain {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Customer poor = new PoorCustomer("Janek");
        Customer rich = new RichCustomer("Rysiek");
        rich.accept(taxi);
    }
}
