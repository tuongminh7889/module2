package ss7.bai_tap;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(5);
        System.out.println(square);
        square = new Square("blue", false, 12);
        square.getArea();
        square.resize(10);
        System.out.println(square);
    }

}
