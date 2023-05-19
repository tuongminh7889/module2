package ss6.bai_tap.circle_cylinder;

public class Circle {
    private double radius = 2.0;
    private String color = "black";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return công thức diện tích là bình phương bán kính nhân số PI
     */
    public double getArea() {
        return (this.radius * this.radius) * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color +
                ", area =" + getArea() + '\'' +
                '}';
    }
}
