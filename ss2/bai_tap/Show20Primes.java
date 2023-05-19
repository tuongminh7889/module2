package ss2.bai_tap;

import java.util.Scanner;

public class Show20Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input quantity primes :");
        int number = Integer.parseInt(scanner.nextLine());
        int countQuantity = 0;
        int n = 2;
        int countPrimes = 0;
        while (countQuantity < number) {
            countPrimes = 0;
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    countPrimes++;
                }
            }
            if (countPrimes == 1) {
                countQuantity++;
                System.out.print(" " + n);
            }
            n++;
        }
    }
}
