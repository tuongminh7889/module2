package ss3.bai_tap;

import java.util.Scanner;

public class FindMinOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input row of array ");
        int r = Integer.parseInt(scanner.nextLine());
        System.out.println("input col of array ");
        int c = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[r][c];
        int min = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Input element " + i + "&" + j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
                min = arr[0][0];
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Min of array is" + min);
    }
}

