package ss3.bai_tap;

import java.util.Scanner;

public class SumOfDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input length square edge");
        int edge = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[edge][edge];
        int sum = 0;
        for (int i = 0; i < edge; i++) {
            for (int j = 0; j < edge; j++) {
                System.out.println("input element to" + i + "&" + j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
            sum += arr[i][i];
        }
        System.out.println("sum of square edge is :" + sum);
    }
}
