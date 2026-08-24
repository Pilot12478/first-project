package PracticePatterns.Transport;

public abstract class TransportFactory {
   public abstract Transport createTransport();
   public void makeTransportMove(){
       Transport transport = createTransport();
       transport.move();
   }
}
