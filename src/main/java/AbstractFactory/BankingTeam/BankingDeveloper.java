package AbstractFactory.BankingTeam;

import AbstractFactory.Developer;

public class BankingDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Пишу код для банковской системы");
    }
}
