package HomeWorkPatterns.FactoryMethod.Transport;

public class Main {
    static void main() {
        TransportFactory transportFactory = new CarFactory();
        transportFactory.startTransport();
    }
}
