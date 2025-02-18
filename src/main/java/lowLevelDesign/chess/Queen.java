package lowLevelDesign.chess;

public class Queen extends Piece {

    public Queen(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(Position start, Position end, Board board) {
        // vertical move, horizontal move, diagonal move
        return (start.getX() == end.getX() || start.getY() == end.getY() ||
                Math.abs(start.getX() - end.getX()) == Math.abs(start.getY() - end.getY()))
                && isPathClear(start, end, board);
    }
}
