package ss1.bai_tap;

import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so bat ky: ");
        num = Integer.parseInt(scanner.nextLine());
        if (num > 100 && num < 1000 || num < 10) {
            switch (num / 100) {
                case 1:
                    System.out.print("one ");
                    break;
                case 2:
                    System.out.print("two ");
                    break;
                case 3:
                    System.out.print("three ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
            }
            System.out.print("hundred ");
            if (num/10 > 0) {
                System.out.print("and ");
            }
            switch (num /10) {
                case 11:
                    System.out.print("eleven ");
                    break;
                case 12:
                    System.out.print("twelve ");
                    break;
                case 13:
                    System.out.print("thirteen ");
                    break;
                case 15:
                    System.out.print("fifteen ");
                    break;
            }
            switch (num / 100) {
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
            }
            switch (num % 10) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
            if (num/100 > 13 && num/100 != 15 && num/100 < 20) {
                System.out.print("teen");
            }
        } else if (num > 20) {
            switch (num / 100) {
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
            }
            switch (num % 10) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        } else if (num > 10) {
            switch (num) {
                case 11:
                    System.out.print("eleven ");
                    break;
                case 12:
                    System.out.print("twelve ");
                    break;
                case 13:
                    System.out.print("thirteen ");
                    break;
                case 14:
                    System.out.print("fourteen ");
                    break;
                case 15:
                    System.out.print("fifteen ");
                    break;
                case 16:
                    System.out.print("sixteen ");
                    break;
                case 17:
                    System.out.print("seventeen ");
                    break;
                case 18:
                    System.out.print("eighteen ");
                    break;
                case 19:
                    System.out.print("nineteen ");
                    break;
            }
        } else {
            switch (num) {
                case 0:
                    System.out.print("zero");
                    break;
                case 10:
                    System.out.print("ten");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
                default:
                    System.out.println("out of ability");
            }
        }
    }
}