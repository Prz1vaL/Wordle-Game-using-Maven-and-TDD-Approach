package stacs.wordle.mainService;

import stacs.wordle.wordChecker.WordChecker;
import stacs.wordle.wordleKeyboard.WordleKeyboard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MainService {

    // Wordle Color Constants
    public static final String YELLOW = "#FFFF00";
    public static final String GREEN = "#00FF00";
    public static final String GREY = "#808080";

    // Declaring Scanner Variables and WordleKeyboard
    private static Scanner scanner = new Scanner(System.in);
    private static WordleKeyboard wordleKeyboard = new WordleKeyboard();
    private static boolean gameStatus = true;


    public static void playGame() {
        ArrayList<String> guessWords = new ArrayList<>();
        general_message();
        System.out.println("Enter a 5 letter word: ");
        String input = scanner.nextLine();
        input = input.trim().toLowerCase();

        while (gameStatus) {
            if (input.equals("exit")) {
                System.out.println("Exiting the game");
                exitGame();
            } else if (input.equals("restart")) {
                System.out.println("Restarting the game");
                restartGame();

            } else if (WordChecker.checkIfValid(input)) {
                guessWords.add(input);


            } else {
                System.out.println("Invalid input..Exiting the game !");
                exitGame();
            }
        }
    }

    private static boolean exitGame() {
        return gameStatus = false;

    }

    private static void restartGame() {
        playGame();
    }


    // Displays the instructions to play the game.
    public static void instructions() {
        File file = new File("src/main/resources/instructions.txt");
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
        String instruction = "\n------------Type \"exit\" to exit or \"restart \" to restart the game------------------";
        System.out.println(instruction);
        String message = "\"\n---------------------------------Playing Game--------------------------------------\"";
        System.out.println(message);
    }

}
