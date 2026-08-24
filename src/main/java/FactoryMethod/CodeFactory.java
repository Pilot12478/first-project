package FactoryMethod;

public abstract class CodeFactory {
    protected abstract Developer createDeveloper();
    public void createApp(){
        Developer developer = createDeveloper();
        developer.writeCode();

        /*
        плюсы теперь код расширяемый, но не модифицируемый
        соблюдаем прицим O Solid
        соблюдаем принцип единой отсветственнсти S

        из минусов появляется еще один уровень абстракции, т.е. дополнительные классы

        мы выносим логику создания объектов из базового класса классам наследникам крч.
         */
    }
}
