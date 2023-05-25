package ss15.ex;

import java.util.Scanner;

public class TriangleDesign {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls input edge A(A>=0) :");
        int edgeA = Integer.parseInt(sc.nextLine());
        System.out.println("Pls input edge B(B>=0) :");
        int edgeB = Integer.parseInt(sc.nextLine());
        System.out.println("Pls input edge C(C>=0) :");
        int edgeC = Integer.parseInt(sc.nextLine());
        try {
            checkEdge(edgeA, edgeB, edgeC);
        } catch (IllegalTriangleException illegalTriangleException) {
            System.out.println(illegalTriangleException.getMessage());
            System.out.println("Pls Input in Ruler (3 edge >0 && Sum 2 edge > 1 edge last !!!");
        }
    }

    public static boolean checkEdge(int a, int b, int c) throws IllegalTriangleException {
        if ((a <= 0) || (b <= 0) || (c <= 0) || ((a + b) <= c) || ((a + c) <= 0) || ((c + b) <= 0)) {
            throw new IllegalTriangleException("Edge wrong !!! ");
        }
        return true;
    }
}


