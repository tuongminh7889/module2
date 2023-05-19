package ss3.bai_tap;

import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 11, 12, 13, 14, 15, 16, 12, 18, 19};
        System.out.println("what number you want delete");
        int x = Integer.parseInt(scanner.nextLine());
        String arr1 = "";
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
                arr1 += i;
                arr1 += ",";
                continue;
            }
            System.out.print("|" + arr[i]);
        }
        for (int i = 0; i < count; i++) {
            System.out.print("|" + 0);
        }
        System.out.println("Index " + arr1 );
    }
}