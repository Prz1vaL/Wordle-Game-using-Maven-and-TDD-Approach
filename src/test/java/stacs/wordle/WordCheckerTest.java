package stacs.wordle;

import org.junit.jupiter.api.Test;
import stacs.wordle.WordChecker;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordCheckerTest {

    @Test
    void testCheckIfValid() {
        assertTrue(WordChecker.checkIfValid("debug"));
        assertFalse(WordChecker.checkIfValid("LETTERBOXED"));
    }
}