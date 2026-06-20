package complexTask4;

import java.util.Arrays;

public class UnitTestHelpersMethods {
    public static double avg(double ...values){
        double avr = Arrays.stream(values).average().orElse(0.0);
        return Math.round(avr*10.0)/10.0;
    }
}
