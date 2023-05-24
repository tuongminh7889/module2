package ss14.ex;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] array = {5, 4, 6, 3, 7, 2, 8, 1, 9};
        insertionSort(array);
    }

    /**
     * Thuật toán sắp xếp chèn
     */
    public static void insertionSort(int[] arr) {
        int indexCompare;        // vị trí của phần tử đem đi so sánh
        int element;          // phần tử được đem đi so sánh
        for (int i = 1; i < arr.length; i++) {
            element = arr[i]; //lấy phần tử thứ i ở trong mảng ra đem đi so sánh
            indexCompare = i;    // gắn vị trí index đem đi cho so sánh
            System.out.println("Element index[" + i + "] to compare ");
            if (element >= arr[indexCompare - 1]) {
                System.out.println("arr[" + indexCompare + "] to more than ");
                System.out.println("stay in old index");
            }
            while (indexCompare > 0 && element < arr[indexCompare - 1]) {
                System.out.println("Arr[" + indexCompare + "] to less arr[" + (indexCompare - 1) + "]");
                arr[indexCompare] = arr[indexCompare - 1];// đổi chỗ (trái qua phải)

                System.out.println("Change index " + "arr[" + indexCompare + "] with " + "arr[" + (indexCompare - 1) + "]");
                indexCompare--;
            }
            arr[indexCompare] = element; //chen x vào
            System.out.print("Array after sort");
            System.out.println(Arrays.toString(arr));
        }
    }
}

