package HomeWorkPatterns.Facade.SmartHomeFacade;


import java.util.Set;

public class SmartHomeFacade {
    private Light light;
    private AirConditioner airConditioner;
    private AlarmSystem alarmSystem;
    public SmartHomeFacade (){
        light = new Light();
        airConditioner = new AirConditioner();
        alarmSystem = new AlarmSystem();
    }

    public void turnOnAllSystems(){
        light.turnOn();
        alarmSystem.turnOn();
        airConditioner.turnOn();
    }

    public void turnOffAllSystems(){
        light.turnOff();
        alarmSystem.turnOff();
        airConditioner.turnOff();
    }

    static void main() {
        SmartHomeFacade smartHomeFacade = new SmartHomeFacade();
        smartHomeFacade.turnOnAllSystems();
        smartHomeFacade.turnOffAllSystems();
    }
}
