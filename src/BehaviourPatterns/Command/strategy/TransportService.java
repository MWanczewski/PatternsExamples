package BehaviourPatterns.Command.strategy;

public class TransportService {
    private TransportStrategy transportStrategy;

    public TransportService(TransportStrategy transportStrategy) {
        this.transportStrategy = transportStrategy;
    }

    public TransportStrategy getTransportStrategy() {
        return transportStrategy;
    }

    public void setTransportStrategy(TransportStrategy transportStrategy) {
        this.transportStrategy = transportStrategy;
    }
    public int getTime(String from, String to) {
        return transportStrategy.getTime(from, to);
    }
    public int getRoadLength(String from, String to) {
        return transportStrategy.roadLength(from, to);
    }

}
