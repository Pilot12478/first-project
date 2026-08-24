package Singleton;

public class Main {
    static void main() {
        ProgramLoger programLoger = ProgramLoger.getProgramLoger();
        programLoger.setLogInLogFile("First log");
        programLoger.setLogInLogFile("Second log");
        programLoger.setLogInLogFile("Third log");

        programLoger.showLogInLogFile();
    }
}
