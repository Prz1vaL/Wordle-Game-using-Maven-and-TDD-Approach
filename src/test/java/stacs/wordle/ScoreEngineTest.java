package stacs.wordle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for ScoreEngine
 *
 * @author 220031985
 */
class ScoreEngineTest {

    @Test
    void testCalculateScore() {
        assertEquals(17.0, ScoreEngine.calculateScore(1));
        assertEquals(83.0, ScoreEngine.calculateScore(5));
    }

    @Test
    void guessDistribution() {
        assertEquals((1.9565217391304348), ScoreEngine.guessDistribution(45, 23));
    }
}