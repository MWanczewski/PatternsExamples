package creational.abstractFactory;

public class OsxUiAbstractFactory implements UiAbstractFactory {
    @Override
    public Button getButton() {
        return new OsxButton();
    }

    @Override
    public Input getInput() {
        return new WindowsInput();
    }
}
