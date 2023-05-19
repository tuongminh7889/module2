package ss5.bai_tap.access_modifier;

public class AccessModifier {
    private double radius;
    private String color;
    public final double PI = 3.14;

    public AccessModifier() {
        radius = 1.0;
        color = "red";
    }

    public AccessModifier(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return (this.radius * this.radius) * PI;
    }

    public String setColor(String color) {
        return this.color = color;
    }

    public String getColor() {
        return this.color;
    }


}
