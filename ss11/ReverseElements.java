package ss11;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElements {
    Scanner sc = new Scanner(System.in);

    /**
     * Thuật toán thay đổi phần tử number trong mảng số nguyên
     */
    public void reverseNumber() {
        Stack<Integer> integerStack = new Stack<>();
        int[] arrayNum = {1, 5, 7, 8, 99};
        for (Integer i : arrayNum) {
            integerStack.push(i);
        }
        System.out.print("After");
        System.out.println(Arrays.toString(arrayNum));
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = integerStack.pop();
        }
        System.out.print("before:");
        System.out.println(Arrays.toString(arrayNum));
    }

    /**
     * Đảo ngược chuỗi ký tụ
     */
    public void reverseString() {
        Stack<String> wStack = new Stack<>();
        System.out.println("Input string array");
        String mWord = sc.nextLine();
        String[] arrayString = mWord.split("");
        for (int i = 0; i < arrayString.length; i++) {
            wStack.push(arrayString[i]);
        }
        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i] = wStack.pop();
        }
        System.out.println("Array after reverse :");
        System.out.println(Arrays.toString(arrayString));
    }

    public static void main(String[] args) {
        ReverseElements reverseElements = new ReverseElements();
        reverseElements.reverseNumber();
        reverseElements.reverseString();
    }
}
