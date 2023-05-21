package ss11;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    /**
     * author Minh c0323g1
     *
     * @param stack dãy nhị phân chưa đươc sắp xếp
     * @return đẩy ngược ra lại rồi mới in
     */
    public static Stack<Integer> reverseStack(Stack<Integer> stack) {
        Stack<Integer> newStack = new Stack<>();
        int length = stack.size();
        for (int i = 0; i < length; i++) {
            newStack.push(stack.pop());
        }
        return newStack;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number you want trans :");
        int n = Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack = new Stack<>();
        System.out.println("Decimal of your num " + n + " is ");
        while (n > 0) {
            stack.push(n % 2);
            if (n % 2 == 1) {
                n = (n - 1) / 2;
            } else {
                n /= 2;
            }
        }
        stack = reverseStack(stack);
        System.out.println(stack);
    }
}
