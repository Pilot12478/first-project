package HomeWorkPatterns.Adapter.MilesToKilometersAdapter;

public class Miles implements Distance{
    private double value;
    public Miles(double value){
        this.value =value;
    }
    @Override
    public double getValue() {
        return value;
    }

    @Override
    public String getUnit() {
        return "миль";
    }
}
