package ss11;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String");
        String stringInput = sc.nextLine();
        Map<String, Integer> treeMap = new TreeMap<>();
        String[] arrayString = stringInput.toLowerCase().split("");
        int valueCount;
        for (String s : arrayString) {
            valueCount = 0;
            if (s.equals(" ")) {
                continue;
            }
            for (String value : arrayString) {
                if (s.equals(value)) {
                    valueCount++;
                }
            }
            treeMap.put(s, valueCount);
        }

        Set<String> key = treeMap.keySet();
        for (String k : key) {
            System.out.println("key: " + k + ", value: " + treeMap.get(k));
        }
    }
}