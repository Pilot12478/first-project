package Mediator;

public class Driver extends Participant {
    private boolean isFree = true;

    public Driver(String name, TaxiMediator mediator) {
        super(name, mediator);
    }

    public void acceptOrder(String passenger) {
        if (isFree) {
            System.out.println(name + ": I'll take " + passenger);
            isFree = false;
            mediator.acceptOrder(name, passenger);
        } else {
            System.out.println(name + ": Sorry, I'm busy");
        }
    }

    public void completeOrder() {
        System.out.println(name + ": Order completed!");
        isFree = true;
        mediator.completeOrder(name);
    }
}
