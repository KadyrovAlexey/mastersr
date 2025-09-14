package Unit02;

public class Task14 {
    public static int reverse(int value) {
        int reversed = 0;

        while (value > 0) {
            int digit = value % 10;      // получаем последнюю цифру
            reversed = reversed * 10 + digit; // добавляем её к результату
            value = value / 10;          // убираем последнюю цифру
        }
        return reversed;
    }

    public static void main(String[] args) {
        int result = reverse(2685);
        System.out.println(result);

    }
}
