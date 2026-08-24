package HomeWorkPatterns.FactoryMethod.Transport;

public class BicycleFactory extends TransportFactory{
    @Override
    public Transport createTransport() {
        return new Bicycle();
    }
}
