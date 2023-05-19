package ss7.bai_tap;

public class ColorableTest {
    public static void main(String[] args) {
        Square square = new Square();
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Rectangle(5, 7);
        shapes[2] = new Square(8);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Type of Shape " + i + " is :" + shapes[i].getArea());
            if (shapes[i] instanceof Square) {
                System.out.println("Element of Shape" + i + " is Square :" + ((Square) shapes[i]).howToColor());
                //  square.howToColor(true);
            }
        }
    }
}
