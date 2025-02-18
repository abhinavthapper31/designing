package lowLevelDesign.chess;

public class Rook extends Piece {

    public Rook(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(Position start, Position end, Board board) {
        return (start.getX() == end.getX() || start.getY() == end.getY()) && isPathClear(start, end, board);
    }
}
