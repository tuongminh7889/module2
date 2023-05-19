package ss7.bai_tap;

public interface Colorable {
    default void howToColor(Boolean color) {
        System.out.println("Color all four sides.");
    }

    String howToColor();

}
