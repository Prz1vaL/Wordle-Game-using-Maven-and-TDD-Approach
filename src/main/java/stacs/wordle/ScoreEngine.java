package stacs.wordle;

/**
 * The ScoreEngine class is responsible for calculating the probability of the player guessing the word.
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
        * @param attempts The number of attempts the player has made.
        * @return The score of the player.
        */
        public static double calculateScore(int attempts) {
            double score = (100.0 - Math.round(MAX_SCORE - (attempts * SCORE_PER_ATTEMPT)));
            if (score < MIN_SCORE) {
                score = (100- MIN_SCORE);
            }
            return score;
        }

    /**
     * The method calculates the guess distribution of the player.
     *
     * @param gamesPlayed
     * @param gamesWon
     * @return guessDistribution
     */
        public static double guessDistribution(double gamesPlayed,double gamesWon){

            if(gamesPlayed / gamesWon != (1/0)){
                return gamesPlayed / gamesWon;
            }
            else {
                return 0;
            }
        }
}
