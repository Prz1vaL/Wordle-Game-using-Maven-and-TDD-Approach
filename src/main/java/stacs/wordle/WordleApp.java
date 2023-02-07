package stacs.wordle;

/**
 * WordleApp is the main class of the Wordle game.
 * It is responsible for loading the wordlist and starting the game.
 *
 * @author 220031985
 * @version 1.0
 * @Date 2023-01-31
 */

public class WordleApp {
    public static void main(String[] args) {
        System.out.println("Welcome to CS5031 - Wordle");
          MainService.instructions();
          MainService.playGame();
    }

}
