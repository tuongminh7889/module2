package ss3.bai_tap;

import java.util.Scanner;

public class SumOfArrayColum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input row of array ");
        int r = Integer.parseInt(scanner.nextLine());
        System.out.println("input col of array ");
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println("what col you want sum");
        int colSum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Input element " + i + "&" + j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
            sum += arr[i][colSum];
        }
        System.out.println("Sum of colum" + colSum + "is" + sum);
    }
}
