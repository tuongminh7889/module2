package ss7.bai_tap;

/**
 * Author Minh C0323G1
 * Tạo lớp hình học với Interface là Resizeable
 * Mạc đình mà sắc và độ filled
 * Xuất ra thông tin màu sắc và boolean của filled
 */
public class Shape implements Resizeable {
    private String color = "green";
    private boolean filled = true;
    private double area;

    @Override
    public Shape resize(double percent, double area) {
        return Resizeable.super.resize(percent, area);
    }

    @Override
    public void resize(double percent) {

    }

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape(String color, boolean filled, double area) {
        this.color = color;
        this.filled = filled;
        this.area = area;

    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}

