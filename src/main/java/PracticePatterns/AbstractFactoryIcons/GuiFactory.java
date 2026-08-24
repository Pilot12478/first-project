package PracticePatterns.AbstractFactoryIcons;

public interface GuiFactory {
    Button createButton();
    Window createWindow();
    Menu createMenu();
}
