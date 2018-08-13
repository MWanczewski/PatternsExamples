package BehaviourPatterns.Command.strategy;

public class CarTransportStrategy implements TransportStrategy {
    @Override
    public int getTime(String from, String to) {
        if("Bialystok".equals(from) && "Warszawa".equals(to)) {
            return 3;
        }
        return 5;
    }

    @Override
    public int roadLength(String from, String to) {
        if("Bialystok".equals(from) && "Warszawa".equals(to)) {
            return 189;
        }
        return 0;
    }
}
