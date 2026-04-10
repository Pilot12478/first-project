package practice8;

public class EmailException extends RuntimeException{
    public EmailException(){
        super("Невалидный email");
    }
}
