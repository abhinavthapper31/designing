package lowLevelDesign.ticTacToe.models;

import javafx.util.Pair;

import java.util.List;

public class Board {
    int size;
    PlayingPiece[][] board;

    public Board(int n) {
        this.size = n;
        this.board = new PlayingPiece[n][n];
    }


    public void printBoard() {
    }

    public List<Pair<Integer,Integer>> getFreeCellsOnBoard() {
        return null;
    }

    public boolean addPieceOnBoard(int row, int column, PlayingPiece playingPiece) {


        return false;
    }
}
