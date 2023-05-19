package ss7.bai_tap;

/**
 * Author MInh C0323G1
 * Bài tâp gán 3 hình vào 3 phần tử của mảng
 * Đưa màn hình những câu lệnh khi thay đổi size bằng random percent
 * Hiện bài chưa tối ưu vì chưa đưa phần diện tích vào trong mảng, có thời gian sẽ gán thêm phương thức resize vào từng hình
 */
public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        System.out.println(shapes[0]);
        shapes[0].resize(Math.random(), circle.getArea());
        shapes[1] = rectangle;
        System.out.println(shapes[1]);
        shapes[1].resize(Math.random(), rectangle.getArea());
        shapes[2] = square;
        System.out.println(shapes[2]);
        shapes[2].resize(Math.random(), square.getArea());

        shapes[0].resize(Math.random());
        shapes[1].resize(20);
        shapes[2].resize(120);

    }
}
