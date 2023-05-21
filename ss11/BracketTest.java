package ss11;

import java.util.Stack;

public class BracketTest {
    public static void main(String[] args) {
        String bracketString = "s * (s – a) * (s – b * (s – c)  ";
        boolean result = checkBracket(bracketString);
        System.out.println(result);
    }
    public static boolean checkBracket(String string) {
        String[] strings = string.split("");
        Stack<String> stack = new Stack<>();

        for (String i : strings) {
            if (i.equals("(")) {
                stack.push(i);
            }

            if (i.equals(")")) {
                if (stack.size() == 0) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.size() == 0;
    }
}

