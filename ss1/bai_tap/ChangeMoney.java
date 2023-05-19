package ss1.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong USD: ");
        int usd = scanner.nextInt();
        int vnd = rate * usd;
        System.out.println("Chuyen doi bang " + vnd + "vnd");
    }
}
