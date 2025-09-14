package Unit02;

public class Task14 {
    public static int reverse(int value) {
        int reversed = 0;

        while (value > 0) {
            int digit = value % 10;
            reversed = reversed * 10 + digit;
            value = value / 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int result = reverse(266);
        System.out.println(result);

    }
}
