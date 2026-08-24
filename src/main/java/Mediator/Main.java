package Mediator;

public class Main {
    static void main() {
        // Создаем диспетчера
        TaxiDispatcher dispatcher = new TaxiDispatcher();

        // Создаем водителей
        Driver driver1 = new Driver("John", dispatcher);
        Driver driver2 = new Driver("Mike", dispatcher);

        // Создаем пассажиров
        Passenger alice = new Passenger("Alice", dispatcher);
        Passenger bob = new Passenger("Bob", dispatcher);

        // Регистрируем всех у диспетчера
        dispatcher.addDriver(driver1);
        dispatcher.addDriver(driver2);
        dispatcher.addPassenger(alice);
        dispatcher.addPassenger(bob);

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Пассажиры вызывают такси
        alice.callTaxi("Central Station");
        bob.callTaxi("Airport");

        // Водитель завершает заказ
        driver1.completeOrder();

        // Теперь Mike может взять новый заказ
        alice.callTaxi("Mall");
    }
}
