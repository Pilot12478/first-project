package HomeWorkPatterns.AbstractFactory.GUI;

public class Main {
    static void main() {
        GUIFactory guiFactory = new WindowsFactory();
        Menu menu = guiFactory.getMenu();
        Button button = guiFactory.getButton();
        Window window = guiFactory.getWindow();

        menu.show();
        button.click();
        window.draw();
    }
}
