package stacs.wordle;

/**
 * The ScoreEngine class is responsible for calculating the Probability and Guess Distribution of the player.
 *
 * @author 220031985
 * @version 1.0
 * @Date 2023-02-05
 */
public class ScoreEngine {


    private static final float MAX_ATTEMPTS = 6;
    private static final float MAX_SCORE = 100;
    private static final float MIN_SCORE = 0;
    private static final double SCORE_PER_ATTEMPT = (MAX_SCORE / MAX_ATTEMPTS);

    /**
     * The method calculates the score of the player.
     *
     * @param attempts The number of attempts the player has made.
     * @return The score of the player.
     */
    public static double calculateScore(int attempts) {
        double score = (100.0 - Math.round(MAX_SCORE - (attempts * SCORE_PER_ATTEMPT)));
        if (score < MIN_SCORE) {
            score = (100 - MIN_SCORE);
        }
        return score;
    }

    /**
     * The method calculates the guess distribution of the player.
     *
     * @param gamesPlayed The number of games played by the player.
     * @param gamesWon   The number of games won by the player.
     * @return guessDistribution   The guess distribution of the player.
     */
    public static double guessDistribution(double gamesPlayed, double gamesWon) {

        if (gamesPlayed == 0 || gamesWon == 0) {
            return 0;
        } else {
            return gamesWon / gamesPlayed;
        }
    }

    /**
     * @param attempts The number of attempts the player has made.
     * @param guesses The number of correct guesses the player has made.
     * @return
     */
    public static double probabilityAlgorithm(double attempts,double guesses){
        // This is a self-made algorithm to calculate the probability of the player based on number of attempts and number of correct guesses.
        double probabilityFactor = 0;
        double probability = 100;
        double probabilityFactorTotal = 0;
        // Question is
        /*
        Find the probability of guessing the right 5-letter word for the following conditions:
        Total number of words is 14855
        Total number of attempts is 6
        One word per attempt (x)
        Find p(n) for each attempt.
        Note : If 'x' word contains a character or more (but not all) of the right 5-letter word in any attempt what is the probability factor in the next attempt?
         */

        // The probability of guessing the right 5-letter word for the following conditions:
    for(int i = 1; i <= attempts; i++){
     double firstDenominator = (14855 - (i - 1));
     double secondDenominator = (26 ^5);
            probabilityFactor = ((1/firstDenominator) + (guesses * (1/secondDenominator)));
            probabilityFactorTotal += probabilityFactor;
        }
        return probabilityFactorTotal;
    }
}
