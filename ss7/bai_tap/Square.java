package ss7.bai_tap;

/**
 * Author Minh C0323G1
 * Lớp hình vuông trong hình học
 * Mạc định cạnh bằng 2
 * công thức chu vi và cạnh X4
 * công thức diện tích Cạnh X Cạnh
 * gán phương thúc resize
 */
public class Square extends Shape implements Colorable {
    private double side = 2.0;
    private double area;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * this.side;
    }

    public double getPrimetter() {
        return side * 4;
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", which is a subclass of " + super.toString() + "}";
    }

    public void resize(double percent) {
        if (percent <= 100.0 && percent >= 0.0) {
            area = side * side * (percent / 100);
        }
    }

    public String howToColor() {
        return "Color all four sides";
    }
}
