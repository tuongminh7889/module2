package ss4.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {

    double a;
    double b;
    double c;

    public double getDiscriminant() {
        return b * b - 4.0 * a * c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void result(double a, double b, double c) {
        if (getDiscriminant() > 0.0) {
            double r1 = (-b + Math.pow(getDiscriminant(), 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(getDiscriminant(), 0.5)) / (2.0 * a);
            System.out.println(r1 + "" + r2);

        } else if (getDiscriminant() == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The equation has one root " + r1);
        } else {
            System.out.println("The equation has no real roots ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input a");
        double a = scanner.nextDouble();
        System.out.print("input b");
        double b = scanner.nextDouble();
        System.out.print("input c");
        double c = scanner.nextDouble();
        QuadraticEquation BuildClassQuadraticEquation = new QuadraticEquation(a, b, c);
        BuildClassQuadraticEquation.result(a, b, c);
    }
}