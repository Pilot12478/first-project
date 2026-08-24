package PracticePatterns.AbstractFactoryIcons;

public class MacFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Window createWindow() {
        return new MacWindow();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}
