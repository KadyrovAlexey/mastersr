package Unit03;

public class Task10 {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int minIndex = 0;
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] <= minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
