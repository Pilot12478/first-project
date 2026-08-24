package FactoryMethod;

public class Main {
    static void main() {
        CodeFactory codeFactory = new JavaDevCreator();
        codeFactory.createApp();

    }
}
