package ss7.bai_tap;

public interface Resizeable {
    /**
     * Author Minh C0323G1
     * Thử 2 cách làm , khác nhau tham số truyền vào
     *
     * @param percent % truyền vào để resize
     * @param area    diện tích truyền vào để resize
     * @return đưa ra 3 dòng sout , vì lúc làm hàm void ko truyền đc ^^
     */
    default Shape resize(double percent, double area) {
        System.out.println("Random percent resize" + percent + "%");
        System.out.println("Area before resize : " + area);
        System.out.println("Area after resize : " + (percent * area) / 100);
        return null;
    }

    void resize(double percent);
}
