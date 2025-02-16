package lowLevelDesign.snakesAndLadders;

import java.util.HashMap;
import java.util.Map;

class Board {
    private static final int WINNING_POSITION = 100;
    private final Map<Integer, Integer> snakes;
    private final Map<Integer, Integer> ladders;

    public Board() {
        snakes = new HashMap<>();
        ladders = new HashMap<>();
        initializeBoard();
    }

    private void initializeBoard() {
        snakes.put(98, 78);
        snakes.put(95, 75);
        snakes.put(92, 88);
        snakes.put(74, 53);
        snakes.put(64, 60);
        snakes.put(45, 25);
        snakes.put(33, 6);
        ladders.put(2, 38);
        ladders.put(7, 14);
        ladders.put(8, 31);
        ladders.put(15, 26);
        ladders.put(28, 84);
        ladders.put(36, 44);
        ladders.put(51, 67);
        ladders.put(71, 91);
        ladders.put(78, 98);
    }

    public int movePlayer(int currentPosition, int diceRoll) {
        int newPosition = currentPosition + diceRoll;
        if (newPosition > WINNING_POSITION) {
            return currentPosition;
        }
        if (snakes.containsKey(newPosition)) {
            System.out.println("Snake Bit");
            return snakes.get(newPosition);
        }
        if (ladders.containsKey(newPosition)) {
            System.out.println("Ladder Help");
            return ladders.get(newPosition);
        }
        return newPosition;
    }

    public int getWinningPosition() {
        return WINNING_POSITION;
    }
}
