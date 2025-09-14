package Unit03;

public class Task13 {
    public static void main(String[] args) {
        int[] arr = {9, 110, 7, 8};
        int[] result = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(result));

    }

    static int[] removeMoreThen1000(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                count++;
            }
        }

        // Создаем новый массив нужного размера
        int[] newArr = new int[count];

        // Заполняем новый массив подходящими числами
        int j = 0; // индекс для нового массива
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                newArr[j] = arr[i];
                j++;
            }
        }

        return newArr;
    }
}
