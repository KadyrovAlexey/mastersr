package Unit02;

public class Task05 {
    public static String solution(int x) {
        int number = Math.abs(x);
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {

                return "FALSE";
            }
            number = number / 10;
        }

        return "TRUE";
    }

    public static void main(String[] args) {

        String result = solution(6046);
        System.out.println(result);

    }
}
