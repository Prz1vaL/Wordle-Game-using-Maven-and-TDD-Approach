package stacs.wordle;

import org.junit.jupiter.api.Test;
import stacs.wordle.RandomEngine;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomEngineTest {

    @Test
    void testGetRandomWord() {

        RandomEngine randomEngine = new RandomEngine();
        String randomWord = randomEngine.getRandomWord();
        assertTrue(randomWord.equals("debug") || randomWord.equals("maven") || randomWord.equals("cache"));
    }
}