package stacs.wordle.wordChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordCheckerTest {

    @Test
    void checkIfValid() {
        assertTrue(WordChecker.checkIfValid("debug"));
        assertFalse(WordChecker.checkIfValid("LETTERBOXED"));
    }
}