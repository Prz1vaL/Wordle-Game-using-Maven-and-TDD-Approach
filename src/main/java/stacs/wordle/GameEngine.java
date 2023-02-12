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

    public static int attempts = 0;
    // Declaring Scanner Variables and WordleGridLayout
    private static final Scanner scanner = new Scanner(System.in);
    private static final WordleGridLayout WORDLE_GRID_LAYOUT = new WordleGridLayout();
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
        WORDLE_GRID_LAYOUT.initialState();
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
                    gameWon();
                    scoreCalculate();
                    if (attempts == 0) {

                        System.out.println("You guessed the word in " + attemptActual + " attempt. You are a genius !");
                        resultMessage();
                        restartGame();
                    } else if (attempts == 1) {
                        System.out.println("You guessed the word in " + attemptActual + " attempts. You are a worthy !");
                        resultMessage();
                        restartGame();
                    } else if(attempts == 2) {
                        System.out.println("You guessed the word in " + attemptActual + " attempts. You are a outstanding !");
                        resultMessage();
                        restartGame();
                    } else if (attempts == 3 ) {
                        System.out.println("You guessed the word in " + attemptActual + " attempts. You are a good !");
                        resultMessage();
                        restartGame();
                    } else if (attempts == 4) {
                        System.out.println("You guessed the word in " + attemptActual + " attempts. You are a average !");
                        resultMessage();
                        restartGame();
                    }
                } else if (attempts == 5) {
                    gamesPlayed = gamesPlayed + 1;
                    attemptActual = attempts + 1;
                    scoreCalculate();
                    System.out.println("You have exceeded the number of attempts. The word was " + randomWord.toUpperCase() + ". Better luck next time!");
                    resultMessage();
                    restartGame();
                }
                attempts += 1;
            } else {
                System.out.println("Not in the dictionary.");
            }
        }
        scanner.close();
    }

    private static void scoreCalculate() {
        scoreHolder = ScoreEngine.calculateScore(attemptActual);
        guessDistribution = ScoreEngine.guessDistribution(gamesPlayed,gamesWon);
    }

    private static void gameWon() {
        gamesPlayed = gamesPlayed + 1;
        gamesWon = gamesWon + 1;
        attemptActual = attempts + 1;
    }

    private static void resultMessage() {
        System.out.println("The probability of you guessing the word in " + attemptActual + " attempt was " + scoreHolder + " %");
        System.out.println("The Guess Distribution after playing " + gamesPlayed + " games is " + (guessDistribution * 100) + " %");
    }


    /**
     * @param guessWords list of words guessed by the user.
     * @param randomWord the word to be guessed.
     *
     */
    public static void drawWordle(ArrayList<String> guessWords, String randomWord) {
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
                        WORDLE_GRID_LAYOUT.alphabets.replace(charLower, 0);
                        System.out.print("[" + RED + charUpper + RESET + "] ");
                        break;

                    case 1:
                        WORDLE_GRID_LAYOUT.alphabets.replace(charLower, 1);
                        if (alphabets.isEmpty()) {
                            System.out.print("[" + YELLOW + charUpper + RESET + "] ");
                            alphabets.add(charLower);
                            break;
                        } else {
                            for (String s : alphabets) {
                                if (charLower.equals(s)) {
                                    System.out.print("[" + RED + charUpper + RESET + "] ");
                                } else {
                                    System.out.print("[" + YELLOW + charUpper + RESET + "] ");
                                    alphabets.add(charLower);
                                }
                                break;

                            }
                        }
                        break;
                    case 2:
                        WORDLE_GRID_LAYOUT.alphabets.replace(charLower, 2);
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


    /**
     * Restarts the game.
     */
    private static void restartGame() {
        playGame();
    }
    

    



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
