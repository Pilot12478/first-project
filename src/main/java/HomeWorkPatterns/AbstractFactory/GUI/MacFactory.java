package HomeWorkPatterns.AbstractFactory.GUI;

public class MacFactory implements GUIFactory{
    @Override
    public Button getButton() {
        return new MacButton();
    }

    @Override
    public Window getWindow() {
        return new WindowMac();
    }

    @Override
    public Menu getMenu() {
        return new MacMenu();
    }
}
