package ss4.bai_tap;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public Fan() {

    }

    public int setSpeed(int speed) {
        return this.speed = speed;
    }

    public boolean setOn(boolean on) {
        return this.on = on;
    }

    public double setRadius(double radius) {
        return this.radius = radius;
    }

    public String setColor(String color) {
        return this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        if (getOn() == true) {
            return "Fan is On, Speed: " + getSpeed() + " , Color: " + getColor() + " , Radius " + getRadius();
        } else {
            return "Fan is Off, Color " + getColor() + " , Radius: " + getRadius();
        }
    }
}
class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        fan2.setSpeed(2);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
