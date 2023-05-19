package ss6.bai_tap.point2d_point3d;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(9, 10);
        System.out.println(point2D);
        Point3D point3D = new Point3D(5, 6, 7);
        System.out.println(point3D);
        point3D.setXYZ(6, 0, 9);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
