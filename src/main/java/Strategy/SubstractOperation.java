package Strategy;

public class SubstractOperation implements Operation{
    @Override
    public double execute(double a, double b) {
        return a-b;
    }
}
