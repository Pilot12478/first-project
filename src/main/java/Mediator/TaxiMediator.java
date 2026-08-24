package Mediator;

public interface TaxiMediator {

    /*
    Отличный выбор! Паттерн Mediator (Посредник) — это поведенческий паттерн,
    который упрощает взаимодействие между объектами,
    заменяя связи "многие ко многим" на связи "один ко многим".
     */
    void callTaxi(String passenger, String location);
    void acceptOrder(String driver, String passenger);
    void completeOrder(String driver);
}
