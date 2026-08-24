package Facade;

public class Main {
    static void main() {
        CPU cpu = new CPU();
        RAM ram = new RAM();
        PowerSupply powerSupply = new PowerSupply();

        Facade facade = new Facade(cpu,ram,powerSupply);
        facade.startComp();
        facade.finishComp();
    }
}
