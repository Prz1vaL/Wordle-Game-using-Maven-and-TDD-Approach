package stacs.wordle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for WordChecker
 *
 * @author 220031985
 */
class WordCheckerTest {

    @Test
    void testCheckIfValid() {
        assertTrue(WordChecker.checkIfValid("debug"));
        assertFalse(WordChecker.checkIfValid("LETTERBOXED"));
    }
}