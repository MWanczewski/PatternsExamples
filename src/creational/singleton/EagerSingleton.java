package creational.singleton;

public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
    private String value;
    private EagerSingleton() {
        value = "Jakas wartosc";
    }
}
