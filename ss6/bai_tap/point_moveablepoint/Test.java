package ss6.bai_tap.point_moveablepoint;

public class Test {
    public static void main(String[] args) {
        MovablePoint go = new MovablePoint(6, 3, 8, 6);
        System.out.println(go);
        go.move();
        System.out.println(go);
        go.move();
        go.move();
        System.out.println(go);
    }
}
