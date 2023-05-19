package ss2.bai_tap;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Print the rectangle\n" +
                "\n" +
                "2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                "\n" +
                "3.Print isosceles triangle\n" +
                "\n" +
                "4.Exit");
        int num = Integer.parseInt(scanner.nextLine());
        switch (num) {
            case 1:
                System.out.println("input length");
                int length = Integer.parseInt(scanner.nextLine());
                System.out.println("Input width");
                int width = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("*");
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("input height");
                int height = Integer.parseInt(scanner.nextLine());
                for (int i = 1; i <= height; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("input height");
                int height1 = Integer.parseInt(scanner.nextLine());
                for (int i = height1; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("You press exit");
                break;
        }
    }
}
