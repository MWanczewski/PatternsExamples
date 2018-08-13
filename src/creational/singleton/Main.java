package creational.singleton;

public class Main {
    public static void main(String[] args) {
        EagerSingleton instance = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();
        System.out.println(instance == instance2);
    }
}
