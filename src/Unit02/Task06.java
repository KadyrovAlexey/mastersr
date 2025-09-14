package Unit02;

public class Task06 {
    public static int solution(int x, int y) {
        int sum = x + y;
        String sumnumbers = String.valueOf(sum);
        int numberSum = sumnumbers.length();
        return numberSum;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);

    }
}
