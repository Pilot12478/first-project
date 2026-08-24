package Mediator;

public class Passenger extends Participant{
    public Passenger(String name, TaxiMediator mediator) {
        super(name, mediator);
    }
    public void callTaxi(String location) {
        System.out.println(name + ": I need a taxi at " + location);
        mediator.callTaxi(name, location);
    }

    public void receiveNotification(String message) {
        System.out.println(name + " received: " + message);
    }
}
