package ss3.bai_tap;

import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr2[] = new int[3];
        int arr1[] = new int[3];
        int arr3[] = new int[6];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("input to arr1");
            arr1[i] = Integer.parseInt(scanner.nextLine());
            System.out.print("input to arr2");
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i - arr1.length];
            }
            System.out.print(arr3[i] + ",");
        }
    }
}

