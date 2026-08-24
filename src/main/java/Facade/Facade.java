package Facade;

public class Facade {
    private CPU cpu;
    private RAM ram;
    private PowerSupply powerSupply;
    public Facade(CPU cpu, RAM ram, PowerSupply powerSupply){
        this.cpu = cpu;
        this.ram = ram;
        this.powerSupply = powerSupply;
    }

    public void startComp(){
        cpu.initialize();
        ram.load();
        powerSupply.turnOn();
    }
    public void finishComp(){
        cpu.shutdown();
        ram.clear();
        powerSupply.turnOff();
    }
}
