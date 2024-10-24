package problem_2;

public class Position {
    private final int vertical;
    private final char horizontal;
    Position(int vertical, char horizontal) {
        this.vertical = vertical;
        this.horizontal = horizontal;
    }
    public int getVertical() {
        return vertical;
    }

    public char getHorizontal() {
        return horizontal;
    }
}
