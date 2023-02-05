package stacs.wordle.scoreEngine;

/**
 * The ScoreEngine class is responsible for calculating the score of the player.
 * @author 220031985
 * @version 1.0
 * @Date 2023-02-05
 */
public class ScoreEngine {

        private static final int MAX_ATTEMPTS = 6;
        private static final int MAX_SCORE = 100;
        private static final int MIN_SCORE = 0;
        private static final int SCORE_PER_ATTEMPT = 10;

        /**
        * The method calculates the score of the player.
        * @param attempts The number of attempts the player has made.
        * @return The score of the player.
        */
        public static int calculateScore(int attempts) {
            int score = MAX_SCORE - (attempts * SCORE_PER_ATTEMPT);
            if (score < MIN_SCORE) {
                score = MIN_SCORE;
            }
            return score;
        }

        /**
        * The method calculates the number of attempts the player has made.
        * @param attempts The number of attempts the player has made.
        * @return The number of attempts the player has made.
        */
        public static int calculateAttempts(int attempts) {
            if (attempts > MAX_ATTEMPTS) {
                attempts = MAX_ATTEMPTS;
            }
            return attempts;
        }

}
