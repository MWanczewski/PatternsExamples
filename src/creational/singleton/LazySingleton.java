package creational.singleton;

public class LazySingleton {
    private final String value;
    private static LazySingleton INSTANCE;
    private LazySingleton(){
        this.value = "jakas wartosc";
    }

    public static LazySingleton getINSTANCE() {
        if(INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
