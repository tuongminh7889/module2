package ss11;

import java.util.Stack;

public class ReverseElements {
    Stack<Integer> wStack = new Stack<>();

    public static void slipt(String mStack) {
        String[] word;
        word = mStack.split("");
    }
    public void reverseElements(Stack<Integer> wStack) {
        Integer[] mWord = new Integer[0];
        for (int i : wStack) {
            mWord = new Integer[]{wStack.pop()};
        }
        System.out.println(mWord);
    }
}