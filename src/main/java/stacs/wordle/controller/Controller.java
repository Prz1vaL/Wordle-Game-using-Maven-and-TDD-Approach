package stacs.wordle.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Controller {

    // Wordle Color Constants
    public static final String YELLOW = "#FFFF00";
    public static final String GREEN = "#00FF00";
    public static final String GREY = "#808080";


public static void playGame() {
    general_message();

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
        System.out.println("----Playing Game----");
        System.out.println("\nEnter \"e\" to exit or restart the game");
    }

}
