package stacs.wordle.mainService;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MainServiceTest {

    @Test
    void instructions() {
    assertEquals("Welcome to CS5031 - Wordle\n" +
            "The aim of the game is to guess the word that has been randomly selected.\n" +
            "You will be given 10 chances to guess the word.\n" +
            "You will be given a hint after every incorrect guess.\n" +
            "The hint will show you the number of letters in the word and the number of letters you have guessed correctly.\n" +
            "You will be given a score based on the number of letters you have guessed correctly.\n" +
            "The game will end when you have guessed the word or you have used all your chances.\n" +
            "Good luck!\n", MainService.instructions());
    }
}