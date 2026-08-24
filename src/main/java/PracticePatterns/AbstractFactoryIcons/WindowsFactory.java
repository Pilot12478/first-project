package PracticePatterns.AbstractFactoryIcons;

public class WindowsFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
