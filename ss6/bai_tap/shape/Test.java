package ss6.bai_tap.shape;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("blue", 6, 7, 8);
        System.out.println(Triangle.class);
        System.out.println(triangle);
        System.out.println("Chu vi"+triangle.getPrimetter());
        System.out.println("Dien tich"+triangle.getArea());

    }
}
