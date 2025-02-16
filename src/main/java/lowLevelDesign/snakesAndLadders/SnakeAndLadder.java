package lowLevelDesign.snakesAndLadders;

import java.util.Scanner;

public class SnakeAndLadder {
    private Board board;
    private Player player1;
    private Player player2;
    private Dice dice;
    private Scanner scanner;

    public SnakeAndLadder() {
        board = new Board();
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
        dice = new Dice();
        scanner = new Scanner(System.in);
    }

    public void play() {
        boolean player1Turn = true;
        while (player1.getPosition() < board.getWinningPosition() &&
                player2.getPosition() < board.getWinningPosition()) {

            Player currentPlayer = player1Turn ? player1 : player2;
            System.out.println("\n" + currentPlayer.getName() + "'s turn. Press Enter to roll the dice.");
            scanner.nextLine();
            int diceRoll = dice.roll();
            System.out.println("Rolled a " + diceRoll);
            int newPosition = board.movePlayer(currentPlayer.getPosition(), diceRoll);
            currentPlayer.setPosition(newPosition);
            System.out.println(currentPlayer.getName() + " moves to " + newPosition);
            if (newPosition == board.getWinningPosition()) {
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }
            player1Turn = !player1Turn;
        }
        scanner.close();
    }
}
