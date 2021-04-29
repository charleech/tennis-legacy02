package com.summitthai.tdd.tennis.legacy;

import java.io.Serializable;

/**
 * <p>
 * This is an interface which describes the feature for demonstrating the
 * {@code Tennis Score Calculation}.
 * </p>
 *
 * @author charlee.ch
 * @version 0.0.1
 * @since 0.0.1
 * @see Serializable
 */
public interface TennisCalculatable extends Serializable {
    /**
     * Initialize the score.
     *
     * @param player1
     *            The player 1
     * @param player2
     *            The player 2
     * @since 0.0.1
     */
    void init(final String player1,
              final String player2);

    /**
     * Reset the score.
     *
     * @since 0.0.1
     */
    void resetScore();

    /**
     * Increase the score for player 1.
     *
     * @since 0.0.1
     */
    void increaseScoreForPlayer1();

    /**
     * Increase the score for player 2.
     *
     * @since 0.0.1
     */
    void increaseScoreForPlayer2();
}
