package PracticePatterns.Transport;

public class CarCreator extends TransportFactory{
    @Override
    public Transport createTransport() {
        return new Car();
    }
}
