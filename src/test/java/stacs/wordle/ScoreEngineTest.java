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
        assertEquals((0.5111111111111111), ScoreEngine.guessDistribution(45, 23));
    }

    @Test
    void probabilityAlgorithm() {
        assertEquals((0.0), ScoreEngine.probabilityAlgorithm(1,6));

    }
}