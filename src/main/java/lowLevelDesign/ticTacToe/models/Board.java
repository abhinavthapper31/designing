package lowLevelDesign.ticTacToe.models;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final int size;
    PlayingPiece[][] board;

    public Board(int n) {
        this.size = n;
        this.board = new PlayingPiece[n][n];
    }

    public int getSize() {
        return size;
    }

    public PlayingPiece[][] getBoard() {
        return board;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getPieceType().name() + "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public List<Pair<Integer, Integer>> getFreeCellsOnBoard() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (this.board[i][j] == null) {
                    freeCells.add(new Pair<>(i, j));
                }
            }
        }

        return freeCells;
    }

    public boolean addPieceOnBoard(int row, int column, PlayingPiece playingPiece) {
        if (board[row][column] != null) {
            return false;
        }
        board[row][column] = playingPiece;
        return true;
    }
}
