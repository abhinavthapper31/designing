package lowLevelDesign.ticTacToe;

import javafx.util.Pair;
import lowLevelDesign.ticTacToe.models.*;

import java.util.*;

public class TicTacToeGame {

    Deque<Player> players;
    Board board;

    TicTacToeGame() {
        // these values can be taken in input as well.
        board = new Board(3);
        players = new LinkedList<>();
        players.add(new Player("abhinav", new PlayingPieceX()));
        players.add(new Player("Ramesh", new PlayingPieceO()));
    }

    public void start() {
        boolean gameNotWon = true;

        while (gameNotWon) {

            Player player = players.removeFirst();

            // print board for player
            board.printBoard();
            List<Pair<Integer, Integer>> freeCells = board.getFreeCellsOnBoard();

            if (freeCells.isEmpty()) {
                System.out.println("No free cells on board");
                gameNotWon = false;
                break;
            }
            System.out.println("Player " + player.getName() + " it is your turn. Enter row and column. With Space ");

            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            String[] values = s.split(" ");

            int row = Integer.parseInt(values[0]);
            int column = Integer.parseInt(values[1]);


            boolean pieceAdditionSuccessful = board.addPieceOnBoard(row, column, player.getPlayingPiece());

            if (!pieceAdditionSuccessful) {
                System.out.println("Incorrect position. Chose again");
                // so player can choose again
                players.addFirst(player);
                continue;
            }

            // now it is turn of other player
            players.addLast(player);

            boolean winner = checkForWinner(row, column, player.getPlayingPiece());

            if (winner) {
                board.printBoard();
                System.out.println("Player " + player.getName() + " won the game");
                return;
            }
        }
        System.out.println("Tied");

    }

    private boolean checkForWinner(int row, int column, PlayingPiece playingPiece) {

        // vertical check
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean diagonalMatch2 = true;


        for (int i = 0; i < board.getSize(); i++) {
            if (board.getBoard()[i][column] == null || board.getBoard()[i][column] != playingPiece) {
                colMatch = false;
            }
        }

        for (int i = 0; i < board.getSize(); i++) {
            if (board.getBoard()[row][i] == null || board.getBoard()[row][i] != playingPiece) {
                rowMatch = false;
            }
        }

        for (int i = 0, j = 0; i < board.getSize() && j < board.getSize(); i++, j++) {
            if (board.getBoard()[i][j] == null || board.getBoard()[i][j] != playingPiece) {
                diagonalMatch = false;
            }
        }

        for (int i = 0, j = board.getSize() - 1; i < board.getSize() && j >= 0; i++, j--) {
            if (board.getBoard()[i][j] == null || board.getBoard()[i][j] != playingPiece) {
                diagonalMatch2 = false;
            }
        }


        return rowMatch || colMatch || diagonalMatch || diagonalMatch2;
    }
}
