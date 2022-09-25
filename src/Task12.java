import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task12 {
    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {

        BigDecimal pr = new BigDecimal(0).setScale(9, RoundingMode.HALF_UP);

        for (int i = 1; i <= 12; i++) {
            pr = sum.multiply(percent);
            sum = sum.add(pr);
        }
        return sum.setScale(9, RoundingMode.HALF_UP);

        //return BigDecimal.ZERO;
    }

    public static void main(String[] args) {

        BigDecimal sum = new BigDecimal(500).setScale(9, RoundingMode.HALF_UP); // 500 руб. на счете
        BigDecimal percent = new BigDecimal(0.00000001f).setScale(9, RoundingMode.HALF_UP); // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }
}
