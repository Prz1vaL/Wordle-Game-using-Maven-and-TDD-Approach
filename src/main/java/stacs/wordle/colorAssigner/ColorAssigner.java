package stacs.wordle.colorAssigner;

import stacs.wordle.randomizer.Randomizer;

public class ColorAssigner {
    private static final Randomizer randomizer = new Randomizer();

    String randomWord = randomizer.getRandomWord();

    public static int colorAssigner(String randomWord, String character, int i) {
        if (character.equals(randomWord.substring(i, i + 1))) {
            return 2;
        } else {
            for (int j = 0; j < randomWord.length(); j++) {
                if (character.equals(randomWord.substring(j, j + 1))){
                    return 1;
                }
            }
        }
        return 0;
    }
}
