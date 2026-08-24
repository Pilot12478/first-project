package Strategy;

public class Calculator {
    Operation operation;
    public Calculator(Operation operation){
        this.operation = operation;
    }
    public double calculate(double a, double b) {
        if (operation == null) {
            throw new IllegalStateException("Please select an operation first!");
        }
        return operation.execute(a,b);
    }
}
