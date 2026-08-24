package HomeWorkPatterns.FactoryMethod.Transport;

public abstract class TransportFactory {
    public abstract Transport createTransport();

    public void startTransport() {
        Transport transport = createTransport();
        transport.move();
    }
}
