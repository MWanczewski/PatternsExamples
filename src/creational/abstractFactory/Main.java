package creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        UiAbstractFactory factory = new OsxUiAbstractFactory();
        Button button = factory.getButton();
        button.show();
        Input input = factory.getInput();
        input.write("SDAsdas");
        input.getText();

    }
}
