package Strategy;

public class DevideOperation implements Operation{
    @Override
    public double execute(double a, double b) {
        return a/b;
    }
}
