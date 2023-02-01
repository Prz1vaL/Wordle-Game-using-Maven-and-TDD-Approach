package stacs.wordle.controller;

import stacs.wordle.wordleKeyboard.WordleKeyboard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Controller {

    // Wordle Color Constants
    public static final String YELLOW = "#FFFF00";
    public static final String GREEN = "#00FF00";
    public static final String GREY = "#808080";

    // Declaring Scanner Variables and WordleKeyboard
    private static Scanner scanner = new Scanner(System.in);
    private static WordleKeyboard wordleKeyboard = new WordleKeyboard();



public static void playGame() {
    general_message();
}

    /**
     * This method is used to get the input from the user.
     * @param scanner - Scanner object
     * @return input - String
     */
public static String getInput(Scanner scanner) {

    boolean gameStatus = true;
    while (gameStatus) {
        System.out.println("Enter a 5 letter word: ");
        String input = getInput(scanner);
        if (input.equals("exit")) {
            gameStatus = false;
        } else if (input.equals("restart")) {
            gameStatus = true;
        } else {
            System.out.println("Invalid input");
        }
    }
    return null;
}




    // Displays the instructions to play the game.
    public static void instructions() {
        File file = new File("src/main/resources/Instructions.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("error");
        }


    }



    private static void general_message() {
        String instruction = "\n------------Type \"exit\" to exit or \"restart \" to restart the game------------";
        System.out.println(instruction);
        String message = "\"\n----------------------------Playing Game----------------------------\"";
        System.out.println(message);
    }

}
