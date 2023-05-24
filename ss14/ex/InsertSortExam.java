package ss14.ex;

import java.util.Arrays;

public class InsertSortExam {
    public static void main(String[] args) {
        int[] array = {5, 4, 6, 3, 7, 2, 8, 1, 9};
        System.out.println("array before sort" + Arrays.toString(array));
        insertionSort(array);
        System.out.println("array after sort" + Arrays.toString(array));
    }

    public static int[] insertionSort(int[] arr) {
        int indexCompare;
        int element;
        for (int i = 1; i < arr.length; i++) {
            element = arr[i];
            indexCompare = i;
            while (indexCompare > 0 && element < arr[indexCompare - 1]) {
                arr[indexCompare] = arr[indexCompare - 1];
                indexCompare--;
            }
            arr[indexCompare] = element;
        }
        return arr;
    }
}



