package stacs.wordle;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static stacs.wordle.GameEngine.drawWordle;

/**
 * Test class for GameEngine
 *
 * @author 220031985
 */
class GameEngineTest {

    @Test
    void testPlayGame() {

        assertEquals(17.0, ScoreEngine.calculateScore(1));
        assertTrue(WordChecker.checkIfValid("debug"));
        assertEquals((0), ColorAssigner.assigner("debug", "a", 3));
    }




        @Test
        void testExitInput() {
            String input = "exit\n";
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            assertDoesNotThrow(() -> GameEngine.playGame());
        }


        @Test
        void testGameWon() {
            GameEngine.gameWon();
            assertEquals(1, GameEngine.gamesWon);
        }

        @Test
        void testResultMessage() {
            GameEngine.gamesPlayed = 5;
            GameEngine.gamesWon = 3;
            GameEngine.guessDistribution = 0.6;
            String expected = "The Guess Distribution after playing 5 games is 60.0 %\n";
            //assertEquals(expected, TestUtils.getOutputString(GameEngine::resultMessage));
        }

        @Test
        void testScoreCalculate() {
            GameEngine.gamesPlayed = 5;
            GameEngine.gamesWon = 3;
            GameEngine.attemptActual = 3;
            GameEngine.scoreCalculate();
            assertEquals(50.0, GameEngine.scoreHolder);
            assertEquals(0.6, GameEngine.guessDistribution);
        }
    }



