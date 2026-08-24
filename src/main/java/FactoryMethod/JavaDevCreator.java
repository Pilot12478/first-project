package FactoryMethod;

public class JavaDevCreator extends CodeFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDev();
    }
}
