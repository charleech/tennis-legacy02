package com.summitthai.tdd.tennis.legacy;

/**
 * <p>
 * This is a concrete implementing class which provides the feature described at
 * {@link TennisCalculatable}.
 * </p>
 *
 * @author charlee.ch
 * @version 0.0.1
 * @since 0.0.1
 * @see TennisCalculatable
 */
public class TennisCalculator implements TennisCalculatable {

    /**
     * This is a constant which represents the {@code version UID} as {@value}.
     *
     * @since 0.0.1
     */
    private static final long serialVersionUID = 1L;

    /**
     * This is a player 1 name.
     *
     * @since 0.0.1
     */
    private String player1Name = null;

    /**
     * This is a player 2 name.
     *
     * @since 0.0.1
     */
    private String player2Name = null;

    /**
     * This is a variable which represents the player 1 score.
     *
     * @since 0.0.1
     */
    private int player1Score = 0;


    /**
     * This is a variable which represents the player 2 score.
     *
     * @since 0.0.1
     */
    private int player2Score = 0;

    /**
     * This is a flag which identifies if it is a deuce mode or not.
     *
     * @since 0.0.1
     */
    private boolean isDeuceMode = false;

    /**
     * This is a flag which identifies if it game is ended or not.
     *
     * @since 0.0.1
     */
    private boolean isGameEnded = false;

    /**
     * Get the instance.
     *
     * @return The instance
     * @since 0.0.1
     */
    public static TennisCalculatable getNewInstance() {
        return new TennisCalculator();
    }

    /**
     * This is a default constructor.
     *
     * @since 0.0.1
     */
    private TennisCalculator() {
        this.resetScore();
    }

    @Override
    public void init(final String player1, final String player2) {
        this.player1Name = player1;
        this.player2Name = player2;
        this.isDeuceMode = false;
        this.isGameEnded = false;
        this.printScore();
    }

    @Override
    public void resetScore() {
        this.player1Score = 0;
        this.player2Score = 0;
    }

    @Override
    public void increaseScoreForPlayer1() {
        this.player1Score += 1;
        this.printScore();
    }

    @Override
    public void increaseScoreForPlayer2() {
        this.player2Score += 1;
        this.printScore();
    }

    /**
     * Print the current score.
     *
     * @since 0.0.1
     */
    protected void printScore() {

        if (this.isGameEnded) {
            System.out.println(
                "The game between "
              + this.player1Name
              + " and "
              + this.player2Name
              + " is ended."
            );
            return;
        }

        if (this.isDeuceMode) {
            this.printScoreDeuceMode();
            return;
        }

        if (this.player1Score == 4 && this.player2Score < 4) {
            System.out.println(this.player1Name + " WIN !");
            this.makeTheGameEnd();
            return;
        }

        if (this.player2Score == 4 && this.player1Score < 4) {
            System.out.println(this.player2Name + " WIN !");
            this.makeTheGameEnd();
            return;
        }

        if (this.player1Score == 3 && this.player2Score == 3) {
            System.out.println("deuce");
            this.isDeuceMode = true;
            this.resetScore();
            return;
        }

        System.out.println(
             this.player1Name + " "
           + this.scoreToMessage(this.player1Score) + " "
           + this.player2Name + " "
           + this.scoreToMessage(this.player2Score)
        );
    }

    /**
     * Print the current score.
     *
     * @since 0.0.1
     */
    protected void printScoreDeuceMode() {
        if (this.player1Score == 1 && this.player2Score == 0) {
            System.out.println(
                this.player1Name
              + " advantage "
              + this.player2Name
            );
        }

        if (this.player2Score == 1 && this.player1Score == 0) {
            System.out.println(
                this.player2Name
              + " advantage "
              + this.player1Name
            );
        }

        if (this.player1Score == this.player2Score) {
            System.out.println("deuce");
            this.isDeuceMode = true;
            this.resetScore();
            return;
        }

        if (this.player1Score == 2 && this.player2Score < 2) {
            System.out.println(
                this.player1Name
              + " WIN ! "
            );
            this.makeTheGameEnd();
        }

        if (this.player2Score == 2 && this.player1Score < 2) {
            System.out.println(
                this.player2Name
              + " WIN ! "
            );
            this.makeTheGameEnd();
        }
    }

    /**
     * Convert the score to message.
     *
     * @param score
     *            The converting score
     * @return The converted message
     * @since 0.0.1
     */
    protected String scoreToMessage(final int score) {
        if (score == 0) {
            return "love";
        } else if (score == 1) {
            return "fifteen";
        } else if (score == 2) {
            return "thirty";
        } else if (score == 3) {
            return "forty";
        } else {
            return "unknown";
        }
    }

    /**
     * Make the game to be ended.
     *
     * @since 0.0.1
     */
    protected void makeTheGameEnd() {
        this.isGameEnded = true;
        this.resetScore();
    }

}
