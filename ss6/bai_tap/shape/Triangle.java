package ss6.bai_tap.shape;

public class Triangle extends Shapes {
    private float a;
    private float b;
    private float c;

    public Triangle(String color, float a, float b, float c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    /**
     * p la nửa chu vi
     *
     * @return Công thức tính diện tích qua 3 cạnh
     */
    public float getArea() {
        float p = getPrimetter() / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public float getPrimetter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
