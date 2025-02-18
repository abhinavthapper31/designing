package lowLevelDesign.chess;

public class King extends Piece {
    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(Position start, Position end, Board board) {
        int dx = Math.abs(start.getX() - end.getX()); // change in xCord
        int dy = Math.abs(start.getY() - end.getY()); // change in yCord

        // King moves one pos anywhere
        // TODO missing check flow for King
        if (dx <= 1 && dy <= 1) {
            return true;
        }
        return false;
    }
}
