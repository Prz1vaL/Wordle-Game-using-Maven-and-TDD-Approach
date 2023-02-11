package stacs.wordle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Class to check if a word is valid.
 *
 * @author 220031985
 */
public class WordChecker {
    static File wordGuess = new File("src/main/resources/wordlist.txt");

    /**
     * @param input word to check is valid.
     * @return true if word is valid, false otherwise.
     */
    public static boolean checkIfValid(String input) {
        try {
            Scanner scanner = new Scanner(wordGuess);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if (data.equals(input)) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
