package creational.singleton;

public class NoNameSingleton {
    private final String value;
    private static volatile NoNameSingleton INSTANCE = new NoNameSingleton();
    public static NoNameSingleton getInstance() {
        return INSTANCE;
    }
    private NoNameSingleton() {
        value = "Jakas wartosc";
    }
}
