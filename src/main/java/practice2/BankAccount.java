package practice2;

public class BankAccount {
    /*
    Создайте класс BankAccount с полями owner и balance.
     Реализуйте конструктор, геттеры, сеттер для владельца, методы deposit(amount) и withdraw(amount) и метод printBalance().
      В main внесите деньги, снимите и выведите баланс.
     */
    String owner;
    int balance;

    BankAccount(String owner, int balance) {
        this.balance = balance;
        this.owner = owner;

    }

    String getOwner() {
        return this.owner;
    }

    int getBalance() {
        return this.balance;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    void withdraw(int amount) {
        this.balance = this.balance - amount;
    }

    void printBalance() {
        System.out.println("Текущий баланс: " + this.balance + " руб");
        System.out.println("Владелец " + this.owner);
    }

    static void main() {
        BankAccount bankAccount1 = new BankAccount("Пупкин В.И.", 2000);
        bankAccount1.deposit(2000);
        bankAccount1.withdraw(500);
        bankAccount1.printBalance();

    }
}
