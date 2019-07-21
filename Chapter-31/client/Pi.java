package client;

import Computeapp.*;
import java.math.*;

public class Pi implements Task {

    private static final BigDecimal ZERO = 
        BigDecimal.valueOf(0);
    private static final BigDecimal  ONE = 
        BigDecimal.valueOf(1);
    private static final BigDecimal FOUR = 
        BigDecimal.valueOf(4);

       private static final int roundingMode = 
        BigDecimal.ROUND_HALF_EVEN;

    private int dig;
    
    
    public Pi(int dig) {
        this.dig = dig;
    }

    
    public Object execute() {
        return ComputeappPi(dig);
    }

    public static BigDecimal ComputeappPi(int dig) {
        int scale = dig + 5;
        BigDecimal arc_5 = arctan(5, scale);
        BigDecimal arc_239 = arctan(239, scale);
        BigDecimal pi = arc_5.multiply(FOUR).subtract(
                                  arc_239).multiply(FOUR);
        return pi.setScale(dig, 
                           BigDecimal.ROUND_HALF_UP);
    }
    
    public static BigDecimal arctan(int inverseX, 
                                  int scale) 
    {
        BigDecimal result, numbers, term;
        BigDecimal inx = BigDecimal.valueOf(inverseX);
        BigDecimal inx2 = 
            BigDecimal.valueOf(inverseX * inverseX);

        numbers = ONE.divide(inx, scale, roundingMode);

        result = numbers;
        int i = 1;
        do {
            numbers = 
                numbers.divide(inx2, scale, roundingMode);
            int denom = 2 * i + 1;
            term = 
                numbers.divide(BigDecimal.valueOf(denom),
                             scale, roundingMode);
            if ((i % 2) != 0) {
                result = result.subtract(term);
            } else {
                result = result.add(term);
            }
            i++;
        } while (term.compareTo(ZERO) != 0);
        return result;
    }
}
