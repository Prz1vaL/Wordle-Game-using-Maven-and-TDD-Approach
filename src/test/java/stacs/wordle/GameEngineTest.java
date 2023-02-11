package stacs.wordle;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static stacs.wordle.GameEngine.drawWordle;

/**
 * Test class for GameEngine
 *
 * @author 220031985
 */
class GameEngineTest {

    @Test
    void playGame() {
       ArrayList <String> guessedWords = new ArrayList<>();
         guessedWords.add("debug");
         guessedWords.add("maven");
         guessedWords.add("cache");
        assertEquals(17.0, ScoreEngine.calculateScore(1));
        assertTrue(WordChecker.checkIfValid("debug"));
        assertEquals((0), ColorAssigner.assigner("debug", "a",3));
    }



    @Test
    void testPlayGame() {
    }
}