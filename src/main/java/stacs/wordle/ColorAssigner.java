package stacs.wordle;

/**
 * Color States are allocated  in values of 0,1,2 where 0 is RED , 1 is YELLOW , 2 is GREEN.
 * @author 220031985
 */
public class ColorAssigner {


    /**
     * @param randomWord the word to be guessed.
     * @param character the character to be checked.
     * @param i the index of the character.
     * @return the color state of the character.
     */
    public static int assigner(String randomWord, String character, int i) {
        String char_corrected = character.toLowerCase();
        if (char_corrected.equals(randomWord.substring(i, i + 1))) {
            return 2;
        } else {
            for (int j = 0; j < randomWord.length(); j++) {
                if (char_corrected.equals(randomWord.substring(j, j + 1))) {
                    return 1;
                }
            }
        }
        return 0;
    }
}

