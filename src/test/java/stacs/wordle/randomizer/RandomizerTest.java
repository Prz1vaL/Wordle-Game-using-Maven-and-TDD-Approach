package stacs.wordle.randomizer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class RandomizerTest {

    @Test
    void getRandomWord() {

        Randomizer randomizer = new Randomizer();
        String randomWord = randomizer.getRandomWord();
    assertTrue(randomWord.equals("debug") || randomWord.equals("maven") || randomWord.equals("cache"));
    }
}