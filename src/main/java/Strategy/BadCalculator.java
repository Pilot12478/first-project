package Strategy;

public class BadCalculator {
    public double calculate(double a, double b, String operation) {
        if (operation.equals("add")) {
            return a + b;
        } else if (operation.equals("subtract")) {
            return a - b;
        } else if (operation.equals("multiply")) {
            return a * b;
        } else if (operation.equals("divide")) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            return a / b;
        } else {
            throw new IllegalArgumentException("Unknown operation!");
        }
    }
}
