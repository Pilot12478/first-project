package HomeWorkPatterns.AbstractFactory.GUI;

public interface GUIFactory {
    Button getButton();
    Window getWindow();
    Menu getMenu();
}
