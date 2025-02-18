package lowLevelDesign.chess;

public class Bishop extends Piece {

    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(Position start, Position end, Board board) {
        // amount of movement of x is same as movement of y to the end position and path is clear till then
        return Math.abs(start.getX() - end.getX()) == Math.abs(start.getY() - end.getY()) &&
                isPathClear(start, end, board);
    }
}
