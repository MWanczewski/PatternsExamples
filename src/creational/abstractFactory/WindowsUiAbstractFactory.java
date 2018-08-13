package creational.abstractFactory;

public class WindowsUiAbstractFactory implements UiAbstractFactory {

    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public Input getInput() {
        return new WindowsInput();
    }
}
