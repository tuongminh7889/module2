package ss11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Class chỉ mang tính chất so sánh chứ chưa tìm thuật toán từ có nghĩa
 */
public class Palindrome {
    public static void main(String[] args) {
        Queue<String> strQueue = new LinkedList<>();

        Stack<String> strStack = new Stack<>();

        String str = "Able was I ere I saw elbA";

        String[] work = str.split("");

        for (String s : work) {
            strQueue.add(s);
            strStack.add(s);
        }

        int count = 0;
        for (int i = 0; i < work.length; i++) {
            if (strStack.pop().equals(strQueue.poll())) {
                count++;
            }
        }
        if (count == work.length) {
            System.out.println(str + ": is palindrome");
        } else {
            System.out.println(str + ": is not palindrome");
        }
    }
}

