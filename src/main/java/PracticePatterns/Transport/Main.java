package PracticePatterns.Transport;

public class Main {
    static void main() {
        TransportFactory transportFactory = new CarCreator();
        transportFactory.makeTransportMove();
    }
}
