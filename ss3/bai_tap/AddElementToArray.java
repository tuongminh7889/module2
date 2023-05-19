package ss3.bai_tap;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {0, 1, 2, 3, 4, 0, 0, 0, 0};
        System.out.println("input element ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("input to index ?");
        int index = Integer.parseInt(scanner.nextLine());
        if (index <= -1 || index > arr.length - 1) {
            System.out.println("Can not add to array");
        } else {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
            for (int i : arr) {
                System.out.print(i + ",");
            }
        }
    }
}

