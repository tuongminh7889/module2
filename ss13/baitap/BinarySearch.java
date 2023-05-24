package ss13.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[]{1, 4, 6, 7, 5, 3, 2, 9, 14, 12, 11, 13};
        Arrays.sort(ints);
        System.out.println("Input your number to search");
        int numInput = Integer.parseInt(scanner.nextLine());
        if ((searchNumber(ints, 0, ints.length - 1, numInput)) == -1) {
            System.out.println("no have in array !!!");
        } else {
            System.out.print("Your number at index :");
            System.out.println(searchNumber(ints, 0, ints.length - 1, numInput));
        }
    }

    public static int searchNumber(int[] array, int left, int right, int value) {
        int mid = (left + right) / 2;
        if (left > right) {
            return -1;
        }
        if (value == array[mid]) {
            return mid;
        } else if (value < array[mid]) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
        return searchNumber(array, left, right, value);
    }
}
