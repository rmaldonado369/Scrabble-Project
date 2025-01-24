package scrabble;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScrabbleProjectDriver {
    public static void main(String[] args) {
        String fileName = "words.txt";  // The file should be in the same directory as this program or provide a full path.

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String word = fileScanner.nextLine().trim();
                int score = calculateScore(word);
                System.out.println("Word: " + word + ", Score: " + score);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            e.printStackTrace();
        }
    }

    private static int calculateScore(String word) {
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            Tile tile = new Tile(word.charAt(i));
            score += tile.getScore();
        }
        return score;
    }
}
