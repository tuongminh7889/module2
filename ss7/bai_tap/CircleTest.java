package ss7.bai_tap;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        circle = new Circle(5.5, "brow", true, 20);
        System.out.println(circle);
        circle.getArea();
        System.out.println(circle.getArea());
        circle.resize(20);
    }
}
