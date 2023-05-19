package ss7.bai_tap;

/**
 * Author Minh C0323G1
 * Lớp Hình chữ nhật trong lớp hình học
 * Mạc định chiều dài chiều rộng = 2.0
 * Công thức chu vi (CDai + CRong) X 2
 * Công thức tính diện tích Chiều dài X CHiều rộng
 */
public class Rectangle extends Shape {
    private double width = 2.0;
    private double length = 2.0;
    private double area;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    public void resize1(double percent) {
        if (percent <= 100.0 && percent >= 0.0) {
            area = width * length * (percent / 100);
        }
    }
}
