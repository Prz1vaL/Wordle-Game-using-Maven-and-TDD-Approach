package stacs.wordle;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Random;

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
        assertTrue(randomEngine.getRandomWord().length() > 0);
        assertTrue(true, "Random word is not empty");
    }
}