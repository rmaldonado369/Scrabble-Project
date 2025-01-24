package scrabble;

public class Tile {
    private char letter;
    private int score;

    public Tile(char letter) {
        this.letter = letter;
        this.score = getScore(letter);
    }

    public char getLetter() {
        return letter;
    }

    public int getScore() {
        return score;
    }

    private static int getScore(char letter) {
        switch (Character.toUpperCase(letter)) {
            case 'A': case 'E': case 'I': case 'O': case 'U': case 'L': case 'N': case 'S': case 'T': case 'R':
                return 1;
            case 'D': case 'G':
                return 2;
            case 'B': case 'C': case 'M': case 'P':
                return 3;
            case 'F': case 'H': case 'V': case 'W': case 'Y':
                return 4;
            case 'K':
                return 5;
            case 'J': case 'X':
                return 8;
            case 'Q': case 'Z':
                return 10;
            default:
                return 0;  // Return 0 if it's not a standard English letter.
        }
    }
}
