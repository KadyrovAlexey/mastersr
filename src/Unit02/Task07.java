package Unit02;

public class Task07 {
    public static int solution(int n, int m, int k) {
        int quetluWidth = n / k;
        int quetluLength = m / k;

        int allqueltu = quetluWidth * quetluLength;
        return allqueltu;
    }

    public static void main(String[] args) {

        int result = solution(20, 50, 3);
        System.out.println(result);

    }
}
