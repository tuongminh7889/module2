package ss11;

import java.util.Scanner;

public class TreeMapCount {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In put you Texts :");
        String strInput = scanner.nextLine().toUpperCase();
        String[] strArr = strInput.split(" ");
        String[] map = new String[0];
        String[] keys = new String[strArr.length];
        int countKey;
        for (int i = 0; i < keys.length; i++) {
            countKey = 0;
            for (int j = 0; j < strArr.length; j++) {
                if (strArr[j]  == (keys[i]) ) {
                    countKey++;
                } else {
                    keys[i] = strArr[j];
                    countKey = 1;
                }
            }map[i] = keys[i] + countKey;
        }
        System.out.println(map);
    }
}