package stacs.wordle;

import stacs.wordle.mainService.MainService;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * WordleApp is the main class of the Wordle game.
 * It is responsible for loading the wordlist and starting the game.
 * @author 220031985
 * @version 1.0
 * @Date 2023-01-31
 */

public class WordleApp
{
    public static void main( String[] args ) {
        System.out.println("Welcome to CS5031 - Wordle");
        MainService.instructions();
        MainService.playGame();
    }

    // Unimplemented skeleton
    // You may refactor this method
    protected static ArrayList<String> loadWordlist(String wordlistPath) throws FileNotFoundException
    {
        return new ArrayList<String>();
    }
}
