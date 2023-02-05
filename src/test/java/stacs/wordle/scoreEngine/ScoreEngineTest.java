package stacs.wordle.scoreEngine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreEngineTest {

    @Test
    void calculateScore() {
        assertEquals(100, ScoreEngine.calculateScore(0));
        assertEquals(16.65, ScoreEngine.calculateScore(5));
    }
}