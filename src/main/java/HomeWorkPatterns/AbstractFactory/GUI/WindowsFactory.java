package HomeWorkPatterns.AbstractFactory.GUI;

public class WindowsFactory implements GUIFactory{

    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public Window getWindow() {
        return new WindowWindows();
    }

    @Override
    public Menu getMenu() {
        return new WindowsMenu();
    }
}
