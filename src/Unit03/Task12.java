package Unit03;

public class Task12 {
    public static void main(String[] args) {
        int[] arr = {9, 110, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Нечего сортировать
        }

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int elem = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = elem;
            }
        }
    }
}
