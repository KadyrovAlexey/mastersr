package Unit02;

public class Task11 {
    public static float benefit(float sum, float percent) {
        float multiplier = 1.0f;
        for (int i = 1; i <= 12; i++) {
            multiplier *= (1.0f + percent);
        }
        return sum * multiplier;
    }

    public static void main(String[] args) {

        float sum = 500;
        float percent = 0.00000001f;

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }
}
