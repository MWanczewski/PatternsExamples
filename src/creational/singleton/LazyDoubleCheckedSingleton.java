package creational.singleton;

public class LazyDoubleCheckedSingleton {
    private final String value;
    private static LazyDoubleCheckedSingleton INSTANCE;
    private LazyDoubleCheckedSingleton(){
        this.value = "jakas wartosc";
    }

    public static LazyDoubleCheckedSingleton getINSTANCE() {
        if(INSTANCE == null) {
            synchronized (LazyDoubleCheckedSingleton.class){
                if(INSTANCE == null) {
                    INSTANCE = new LazyDoubleCheckedSingleton();
                }
            }
            INSTANCE = new LazyDoubleCheckedSingleton();
        }
        return INSTANCE;
    }
}
