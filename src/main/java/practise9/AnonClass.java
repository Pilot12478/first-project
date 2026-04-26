package practise9;

public class AnonClass {
    static void main() {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        run.run();
    }
}
