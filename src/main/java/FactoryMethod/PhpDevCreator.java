package FactoryMethod;

public class PhpDevCreator extends CodeFactory{
    @Override
    public Developer createDeveloper() {
        return new PHPDev();
    }
}
