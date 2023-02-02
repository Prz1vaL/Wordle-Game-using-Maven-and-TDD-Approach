package stacs.wordle.randomizer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomizerTest {

    @Test
    void getRandomWord() {

        Randomizer randomizer = new Randomizer();
        String randomWord = randomizer.getRandomWord();
        assertTrue(randomWord.equals("debug") || randomWord.equals("maven") || randomWord.equals("cache"));
    }
}