package Unit03;

public class Task08 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));

    }

    static long mult(int[] arr) {
        if(arr == null || arr.length == 0){
            return 0;
        }
        long number = 1;
        for (int i = 0; i < arr.length; i++){
            number *= arr[i];
        }
        return number;
    }
}
