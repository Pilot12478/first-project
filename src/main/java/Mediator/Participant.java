package Mediator;

public abstract class Participant {
    protected String name;
    protected TaxiMediator mediator;

    public Participant(String name, TaxiMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
