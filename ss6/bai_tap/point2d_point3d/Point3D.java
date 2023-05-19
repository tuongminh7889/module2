package ss6.bai_tap.point2d_point3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), getZ()};
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        setZ(z);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + getZ() +
                ", x=" + getX() +
                ", y=" + getY() +
                ", [x,y,z]=" + Arrays.toString(getXYZ()) +
                '}';
    }
}
