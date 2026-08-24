package PracticePatterns.Transport;

public class BicycleCreator extends TransportFactory{
    @Override
    public Transport createTransport() {
        return new Bicycle();
    }
}
