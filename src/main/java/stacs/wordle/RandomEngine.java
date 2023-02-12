package stacs.wordle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 * This class is used to generate a random word from a list of words.
 *
 * @author 220031985
 */
public class RandomEngine {
    File randomWords = new File("src/main/resources/wordlist.txt");
   // File randomWords = new File("src/test/resources/wordlist-test.txt");
    Random random = new Random();
    int randomInt = random.nextInt(3);
    int i = 0;

    /**
     * @return a random word from the list of words.
     */
    public String getRandomWord() {
        try {
            Scanner scanner = new Scanner(randomWords);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if (i == randomInt) {
                    return data;
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return "ERROR";
    }
}
