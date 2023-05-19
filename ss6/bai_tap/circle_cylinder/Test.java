package ss6.bai_tap.circle_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle cylinder = new Cylinder(7, "blue", 15);
        if (cylinder instanceof Cylinder) {
            System.out.println(((Cylinder) cylinder).getVolume());
        }
        System.out.println(cylinder);
    }
}
