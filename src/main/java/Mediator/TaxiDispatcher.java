package Mediator;

import java.util.ArrayList;
import java.util.List;

public class TaxiDispatcher implements TaxiMediator{
    private List<Driver> drivers = new ArrayList<>();
    private List<Passenger> passengers = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
        System.out.println("Dispatcher: " + driver.name + " is online");
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
        System.out.println("Dispatcher: " + passenger.name + " is ready");
    }

    @Override
    public void callTaxi(String passenger, String location) {
        System.out.println("\nDispatcher: Searching for a free driver for " + passenger);

        // Ищем свободного водителя
        for (Driver driver : drivers) {
            // В реальности здесь была бы проверка isFree, но для простоты пропустим
            driver.acceptOrder(passenger);
            break; // Для простоты берем первого
        }
    }

    @Override
    public void acceptOrder(String driver, String passenger) {
        System.out.println("Dispatcher: " + driver + " accepted order from " + passenger);
        // Уведомляем пассажира
        for (Passenger p : passengers) {
            if (p.name.equals(passenger)) {
                p.receiveNotification("Driver " + driver + " is coming to you!");
            }
        }
    }

    @Override
    public void completeOrder(String driver) {
        System.out.println("Dispatcher: " + driver + " completed the order");
        System.out.println("Dispatcher: Looking for new orders for " + driver + "\n");
    }
}
