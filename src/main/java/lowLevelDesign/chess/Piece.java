package lowLevelDesign.chess;

public abstract class Piece {
    protected boolean isWhite;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public abstract boolean isValidMove(Position start, Position end, Board board);

    protected boolean isPathClear(Position start, Position end, Board board) {
        int dx = Integer.compare(end.getX(), start.getX());
        int dy = Integer.compare(end.getY(), start.getY());
        int x = start.getX() + dx;
        int y = start.getY() + dy;

        while (x != end.getX() || y != end.getY()) {
            if (board.getPiece(new Position(x, y)) != null) {
                return false;
            }
            x += dx;
            y += dy;
        }
        return true;
    }
}
