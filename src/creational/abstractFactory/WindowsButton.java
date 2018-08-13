package creational.abstractFactory;

public class WindowsButton  implements Button {

    @Override
    public void click() {
        System.out.println("Nie dotykaj win xp");

    }

    @Override
    public void show() {
        System.out.println("Jestem przyciskiem z windowsa");
    }
}
