package Unit02;
import java.math.BigDecimal;

public class Task12 {
    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {
        for (int i = 1; i <= 12; i++) {
            // sum += sum * percent;
            sum = sum.add(sum.multiply(percent));

            sum = sum.setScale(9,BigDecimal.ROUND_HALF_UP);
        }
        return sum;
    }

    public static void main(String[] args) {

        BigDecimal sum = new BigDecimal(500).setScale(9, BigDecimal.ROUND_HALF_UP);
        BigDecimal percent = new BigDecimal(0.00000001f).setScale(9, BigDecimal.ROUND_HALF_UP);

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }
}
