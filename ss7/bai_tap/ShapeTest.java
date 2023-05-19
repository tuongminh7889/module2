package ss7.bai_tap;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
        shape = new Shape("blue", true, 10.0);
        System.out.println(shape);
        shape.resize(10);
        System.out.println(shape);
    }
}

