package HomeWorkPatterns.Adapter.MilesToKilometersAdapter;

public class MilesToKilometersAdapter implements Distance {
    private Miles miles;
    private static final double MILE_COEFFICIENT = 1.61;

    public MilesToKilometersAdapter(Miles miles) {
        this.miles = miles;
    }

    @Override
    public double getValue() {
        return miles.getValue() * MILE_COEFFICIENT;
    }

    @Override
    public String getUnit() {
        return "км";
    }

    static void main() {
        Miles miles = new Miles(3.4);
        MilesToKilometersAdapter milesToKilometersAdapter = new MilesToKilometersAdapter(miles);
        System.out.println(milesToKilometersAdapter.getValue() + " " + milesToKilometersAdapter.getUnit());
    }
}
