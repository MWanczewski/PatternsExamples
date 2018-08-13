package creational.abstractFactory;

public class OsxButton implements Button {
    @Override
    public void click() {
        System.out.println("Apple click");
    }

    @Override
    public void show() {
        System.out.println("Im so OSX Button");
    }
}
