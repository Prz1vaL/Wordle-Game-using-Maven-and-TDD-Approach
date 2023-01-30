package stacs.wordle.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Controller {
    // Displays the instructions to play the game.
    public static void instructions() {
        File file = new File("/Users/apm30/Downloads/Wordle/src/main/resources/Instructions.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("error");
        }


    }

    public static void playGame() {
        general_message();
    }
    private static void general_message() {
        System.out.println("----Playing Game----");
        System.out.println("\nEnter \"e\" to exit or restart the game");
    }

}
