package ss13.baitap;

import java.util.LinkedList;
import java.util.Scanner;

public class LongestStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        char max;
        String string = scanner.nextLine();
        LinkedList<Character> maxString = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            max = string.charAt(i);
            for (int j = i; j < string.length(); j++) {
                if (string.charAt(j) >= max) {
                    max = string.charAt(j);
                    list.add(string.charAt(j));
                } else {
                    break;
                }
            }
            if (list.size() > maxString.size()) {
                maxString.clear();
                maxString.addAll(list);
            }
            list.clear();
        }
        for (Character ch : maxString) {
            System.out.print(ch);
        }
    }
}

