package ss3.bai_tap;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "iloveyoumorethanicansay";
        System.out.println("Input element you to find");
        char find = scanner.next().charAt(0);
        int countFind = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == find) {
                countFind++;
            }
        }
        System.out.println("Element: " + find + " in " + str + "is appear :" + countFind);
    }
}
