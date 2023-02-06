package stacs.wordle;

import org.junit.jupiter.api.Test;
import stacs.wordle.ScoreEngine;

import static org.junit.jupiter.api.Assertions.*;

class ScoreEngineTest {

    @Test
    void calculateScore() {
        assertEquals(17.0, ScoreEngine.calculateScore(1));
        assertEquals(83.0, ScoreEngine.calculateScore(5));
    }
}