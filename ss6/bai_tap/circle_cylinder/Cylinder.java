package ss6.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return công thức tính thể tích : diện tích đáy nhân chiều cao
     */
    public double getVolume() {
        return getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() +
                ", radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                ", area =" + getArea() +
                ", volume =" + getVolume() +
                '}';
    }
}
