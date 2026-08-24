package AbstractFactory;

public class Main {
    static void main() {
        ItTeam bankingSystemFactory = new BankingSystemFactory();
        Developer developer = bankingSystemFactory.getDev();
        Tester tester =bankingSystemFactory.getTester();
        developer.writeCode();
        tester.test();
    }
}
