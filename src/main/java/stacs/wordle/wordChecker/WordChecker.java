package stacs.wordle.wordChecker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordChecker {
    static File wordGuess = new File("src/main/resources/wordlist.txt");

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
