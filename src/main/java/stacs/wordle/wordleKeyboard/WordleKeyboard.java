package stacs.wordle.wordleKeyboard;

import java.util.Hashtable;

/**
 * This class is the keyboard layout fo the wordle game.It is a 2D array of the alphabets.
 *
 * @author 220031985
 */
public class WordleKeyboard {
    String keyboardLayout[] = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V", "B", "N", "M"};
    Hashtable<String, Integer> alphabets = new Hashtable<>();

    public WordleKeyboard() {
        InitialState();
    }


    //  Resetting the keyboard layout.
    // '3' is given as default value as 0,1,2 are defined as states in the game.

    private void InitialState() {
        alphabets.put("a", 3);
        alphabets.put("b", 3);
        alphabets.put("c", 3);
        alphabets.put("d", 3);
        alphabets.put("e", 3);
        alphabets.put("f", 3);
        alphabets.put("g", 3);
        alphabets.put("h", 3);
        alphabets.put("i", 3);
        alphabets.put("j", 3);
        alphabets.put("k", 3);
        alphabets.put("l", 3);
        alphabets.put("m", 3);
        alphabets.put("n", 3);
        alphabets.put("o", 3);
        alphabets.put("p", 3);
        alphabets.put("q", 3);
        alphabets.put("r", 3);
        alphabets.put("s", 3);
        alphabets.put("t", 3);
        alphabets.put("u", 3);
        alphabets.put("v", 3);
        alphabets.put("w", 3);
        alphabets.put("x", 3);
        alphabets.put("y", 3);
        alphabets.put("z", 3);
    }
}
