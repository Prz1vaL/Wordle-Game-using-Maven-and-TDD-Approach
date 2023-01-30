package stacs.wordle;

import stacs.wordle.controller.Controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class WordleApp
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to CS5031 - Wordle");
        Controller.instructions();
        Controller.playGame();
    }

    // Unimplemented skeleton
    // You may refactor this method
    protected static ArrayList<String> loadWordlist(String wordlistPath) throws FileNotFoundException
    {
        return new ArrayList<String>();
    }
}
