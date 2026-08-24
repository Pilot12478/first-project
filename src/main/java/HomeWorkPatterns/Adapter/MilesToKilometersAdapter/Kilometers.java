package HomeWorkPatterns.Adapter.MilesToKilometersAdapter;

public class Kilometers implements Distance {
    private double value;
    public Kilometers(double value){
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public String getUnit() {
        return "км";

    }
}
