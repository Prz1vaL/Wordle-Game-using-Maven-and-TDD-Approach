package stacs.wordle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The GameEngine class is responsible for the logic of the game.
 *
 * @author 220031985
 * @version 1.0
 * @Date 2023-02-02
 */
public class GameEngine {

    // https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
    // Wordle Color Constants
    public static final String YELLOW = "\u001B[33m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    private static final RandomEngine RANDOM_ENGINE = new RandomEngine();
    private static final ScoreEngine SCORE_ENGINE = new ScoreEngine();
    public static int attempts = 0;
    // Declaring Scanner Variables and WordleKeyboard
    private static final Scanner scanner = new Scanner(System.in);
    private static final WordleKeyboard wordleKeyboard = new WordleKeyboard();
    private static boolean gameStatus = true;
    private static final ArrayList<String> alphabets = new ArrayList<>();
    private static int attemptActual;
    private static int gamesPlayed;

    private static int gamesWon;
    private static double scoreHolder;

    private static double guessDistribution;


    /**
     * The main method that holds the logic for the game.
     */
    public static void playGame() {
        ArrayList<String> guessWords = new ArrayList<>();
        general_message();
        wordleKeyboard.initialState();
        String randomWord = RANDOM_ENGINE.getRandomWord().trim().toLowerCase();
        attempts = 0;

        while (gameStatus) {
            System.out.println("Enter a 5 letter word: ");
            String input = scanner.nextLine();
            // Standardizing the input.
            input = input.trim().toLowerCase();
            if (input.equals("exit")) {
                System.out.println("Exiting the game");
                gameStatus = false;
            } else if (input.equals("restart")) {
                System.out.println("Restarting the game");
                restartGame();

            } else if (WordChecker.checkIfValid(input)) {
                guessWords.add(input);
                drawWordle(guessWords, randomWord);
                if (guessWords.get(attempts).equals(randomWord)) {
                    gameStatus = false;
                    attemptActual = attempts + 1;
                    scoreHolder = ScoreEngine.calculateScore(attemptActual);
                    guessDistribution = ScoreEngine.guessDistribution(gamesPlayed,gamesWon);
                    if (attempts == 0) {
                        System.out.println("You guessed the word in " + attemptActual + " attempt. You are a genius !");
                        System.out.println("The probability of you guessing the word in " + attemptActual + " attempt was " + scoreHolder + " %");
                        // TO BE IMPLEMENTED : System.out.println("The Guess Distribution " + attemptActual + " attempt was " + scoreHolder + " %");
                    } else {
                        System.out.println("You guessed the word in " + attemptActual + " attempts. You are a good !");
                        System.out.println("The probability of you guessing the word in " + attemptActual + " attempts was " + scoreHolder + " %");
                    }
                    gameStatus = false;
                } else if (attempts == 5) {
                    System.out.println("You have exceeded the number of attempts. The word was " + randomWord.toUpperCase() + ". Better luck next time!");

                    gameStatus = false;
                }
                attempts += 1;
            } else {
                System.out.println("Not in the dictionary.");
            }
        }
        scanner.close();
    }


    private static void drawWordle(ArrayList<String> guessWords, String randomWord) {
        for (int i = 0; i < 21; i++) {
            System.out.print("*");
        }
        System.out.println("\n");
        for (String guessWord : guessWords) {
            for (int j = 0; j < 5; j++) {

                String charUpper = guessWord.substring(j, j + 1).toUpperCase();
                String charLower = guessWord.substring(j, j + 1).toLowerCase();
                int code = ColorAssigner.assigner(randomWord, charUpper, j);
                switch (code) {
                    case 0:
                        wordleKeyboard.alphabets.replace(charLower, 0);
                        System.out.print("[" + RED + charUpper + RESET + "] ");
                        break;

                    case 1:
                        wordleKeyboard.alphabets.replace(charLower, 1);
                        if (alphabets.isEmpty()) {
                            System.out.print("[" + YELLOW + charUpper + RESET + "] ");
                            alphabets.add(charLower);
                            break;
                        } else {
                            for (String s : alphabets) {
                                if (charLower.equals(s)) {
                                    System.out.print("[" + RED + charUpper + RESET + "] ");
                                    break;
                                } else {
                                    System.out.print("[" + YELLOW + charUpper + RESET + "] ");
                                    alphabets.add(charLower);
                                    break;
                                }

                            }
                        }
                        break;
                    case 2:
                        wordleKeyboard.alphabets.replace(charLower, 2);
                        System.out.print("[" + GREEN + charUpper + RESET + "] ");
                        break;
                }
            }
            alphabets.clear();
            System.out.println();
        }

        for (int gridLength = guessWords.size(); gridLength < 6; gridLength++) {
            System.out.println("[x] [x] [x] [x] [x]");
        }
        System.out.println();

        for (int i = 0; i < 21; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }


    private static void restartGame() {
        playGame();
    }


    // Displays the instructions to play the game.
    public static short instructions() {
        File file = new File("src/main/resources/instructions.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("error");
        }


        return 0;
    }


    private static void general_message() {
        String instruction = "\n------------Type \"exit\" to exit or \"restart \" to restart the game------------------";
        System.out.println(instruction);
        String message = "\"\n---------------------------------Playing Game--------------------------------------\"";
        System.out.println(message);
    }

}