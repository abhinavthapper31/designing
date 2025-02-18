package lowLevelDesign.chess;

public class Board {
    private Piece[][] grid = new Piece[8][8];

    public Piece getPiece(Position position) {
        return grid[position.getX()][position.getY()];
    }

    public void setPiece(Position position, Piece piece) {
        grid[position.getX()][position.getY()] = piece;
    }

    public boolean movePiece(Position start, Position end) {
        Piece piece = getPiece(start);
        if (piece != null && piece.isValidMove(start, end, this)) {
            setPiece(end, piece);
            setPiece(start, null);
            return true;
        }
        return false;
    }

    protected boolean isPathClear(Position start, Position end, Board board, boolean isWhite) {
        int dx = Integer.compare(end.getX(), start.getX()); // Direction in X (-1, 0, or 1)
        int dy = Integer.compare(end.getY(), start.getY()); // Direction in Y (-1, 0, or 1)
        int x = start.getX() + dx;
        int y = start.getY() + dy;

        while (x != end.getX() || y != end.getY()) {
            if (board.getPiece(new Position(x, y)) != null) { // If any piece is in the way
                return false;
            }
            x += dx;
            y += dy;
        }

        Piece destinationPiece = board.getPiece(end);
        return destinationPiece == null || destinationPiece.isWhite() != isWhite;
    }

}
