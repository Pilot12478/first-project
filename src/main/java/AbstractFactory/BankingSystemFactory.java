package AbstractFactory;

import AbstractFactory.BankingTeam.BankingDeveloper;
import AbstractFactory.BankingTeam.BankingSystemTestet;

public class BankingSystemFactory implements ItTeam{
    @Override
    public Developer getDev() {
        return new BankingDeveloper();
    }

    @Override
    public Tester getTester() {
        return new BankingSystemTestet();
    }
}
