package structuralPattern.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        RealBasket realBasket = new RealBasket();
        Client client = new Client(new BasketLoggerProxxy(realBasket));
        client.doActions();
        System.out.println("Wsyztkie produkty w koszyku Klienta");
    }

}
