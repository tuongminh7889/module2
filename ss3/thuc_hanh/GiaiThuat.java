package ss3.thuc_hanh;

import java.util.Scanner;

public class GiaiThuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
        for (int i = 4; i >0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
