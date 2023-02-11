package stacs.wordle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for RandomEngine
 *
 * @author 220031985
 */
class RandomEngineTest {

    @Test
    void testGetRandomWord() {

        RandomEngine randomEngine = new RandomEngine();
        String randomWord = randomEngine.getRandomWord();
        assertTrue(randomWord.equals("debug") || randomWord.equals("maven") || randomWord.equals("cache"));
    }
}