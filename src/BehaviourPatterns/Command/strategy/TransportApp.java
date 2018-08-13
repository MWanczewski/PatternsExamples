package BehaviourPatterns.Command.strategy;

public class TransportApp {
    public static void main(String[] args) {
        TransportStrategy strategy = new CarTransportStrategy();
        TransportService service = new TransportService(strategy);
        System.out.println(service.getTime("Bialystok", "Warszawa"));
        System.out.println(service.getRoadLength("Bialystok", "Warszawa"));
        strategy = new TrainTransportStrategy();
        service.setTransportStrategy(strategy);
        System.out.println(service.getTime("Bialystok", "Warszawa"));
        System.out.println(service.getRoadLength("Bialystok", "Warszawa"));


    }
}
