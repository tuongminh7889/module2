package ss3.bai_tap;

import java.util.Scanner;

public class FindMaxOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float max = 0;
        System.out.println("input row of array ");
        int r = Integer.parseInt(scanner.nextLine());
        System.out.println("input col of array ");
        int c = Integer.parseInt(scanner.nextLine());
        float[][] arr = new float[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Input element " + i + "&" + j);
                arr[i][j] = Float.parseFloat(scanner.nextLine());
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
