package PracticePatterns.AbstractFactoryIcons;

public class Main {
    static void main() {
        GuiFactory guiFactory = new WindowsFactory();
        Button button = guiFactory.createButton();
        Menu menu = guiFactory.createMenu();
        Window window = guiFactory.createWindow();

        button.click();
        window.draw();
        menu.show();
    }
}
