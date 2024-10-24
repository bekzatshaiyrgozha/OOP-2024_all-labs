package problem_2;
public abstract class Piece {
    protected Position position;

    public Position getPosition() {
        return position;
    }

    public abstract boolean isLegalMove(Position secondPosition);
}