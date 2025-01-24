package scrabble;

public class ScrabbleSet {
    private static final int BOARD_SIZE = 15;
    private Tile[][] board = new Tile[BOARD_SIZE][BOARD_SIZE];

    public ScrabbleSet() {
        // Initialize the board with nulls representing empty spaces.
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = null;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getLetter() + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
