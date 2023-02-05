package stacs.wordle.scoreEngine;

import stacs.wordle.mainService.MainService;

/**
 * The ScoreEngine class is responsible for calculating the score of the player.
 * @author 220031985
 * @version 1.0
 * @Date 2023-02-05
 */
public class ScoreEngine {

        private static final float MAX_ATTEMPTS = 6;
        private static final float MAX_SCORE = 100;
        private static final float MIN_SCORE = 0;
        private static final double SCORE_PER_ATTEMPT = (MAX_SCORE / MAX_ATTEMPTS);

        private static final MainService MAIN_SERVICE = new MainService();



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
}
