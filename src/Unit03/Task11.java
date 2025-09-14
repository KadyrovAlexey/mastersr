package Unit03;

public class Task11 {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }

        int firstelem = arr[0];
        arr[0] = arr[minIndex];
        arr[minIndex] = firstelem;
    }

}
