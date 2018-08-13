package BehaviourPatterns.Command.strategy;

public class TrainTransportStrategy implements TransportStrategy {
    @Override
    public int getTime(String from, String to) {
        if("Bialystok".equals(from) && "Warszawa".equals(to)) {
            return 2;
        }
        return 5;
    }

    @Override
    public int roadLength(String from, String to) {
        if("Bialystok".equals(from) && "Warszawa".equals(to)) {
            return 167;
        }
        return 0;
    }
}
