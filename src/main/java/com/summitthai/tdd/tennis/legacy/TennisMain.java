package com.summitthai.tdd.tennis.legacy;

/**
 * <p>
 * This is a main class which simulates the Tennis games scenarios.
 * </p>
 *
 * @author charlee.ch
 * @version 0.0.1
 * @since 0.0.1
 * @see TennisCalculatable
 */
public class TennisMain {

    /**
     * This is a main method.
     *
     * @param args The arguments
     * @since 0.0.1
     */
    public static void main(final String[] args) {
        TennisMain main = null;
        try {
            main = new TennisMain();
            main.player1Win();
            main.player2Win();
            main.player1WinWithDeuceMode();
            main.player2WinWithDeuceMode();
            main.player1WinWithDoubleDeuceMode();
            main.player2WinWithDoubleDeuceMode();
        } finally {
            main = null;
        }
    }

    /**
     * This is a case when the player1 win with normal mode.
     *
     * @since 0.0.1
     */
    protected void player1Win() {
        TennisCalculatable cal = null;
        try {
            cal = TennisCalculator.getNewInstance();
            cal.init("John", "Peter");

            cal.increaseScoreForPlayer1();
            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer1();
            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer1();

            cal.increaseScoreForPlayer1();

            /*
             * The game is ended.
             */
            cal.increaseScoreForPlayer1();
        } finally {
            cal = null;
        }
    }

    /**
     * This is a case when the player2 win with normal mode.
     *
     * @since 0.0.1
     */
    protected void player2Win() {
        TennisCalculatable cal = null;
        try {
            cal = TennisCalculator.getNewInstance();
            cal.init("John", "Peter");

            cal.increaseScoreForPlayer1();
            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer1();
            cal.increaseScoreForPlayer2();


            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer2();

            /*
             * The game is ended.
             */
            cal.increaseScoreForPlayer2();
        } finally {
            cal = null;
        }
    }

    /**
     * This is a case when the player1 win with deuce mode.
     *
     * @since 0.0.1
     */
    protected void player1WinWithDeuceMode() {
        TennisCalculatable cal = null;
        try {
            cal = TennisCalculator.getNewInstance();
            cal.init("John", "Peter");

            cal.increaseScoreForPlayer1();
            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer1();
            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer1();

            cal.increaseScoreForPlayer1();
            cal.increaseScoreForPlayer1();

            /*
             * The game is ended.
             */
            cal.increaseScoreForPlayer1();
        } finally {
            cal = null;
        }
    }

    /**
     * This is a case when the player2 win with deuce mode.
     *
     * @since 0.0.1
     */
    protected void player2WinWithDeuceMode() {
        TennisCalculatable cal = null;
        try {
            cal = TennisCalculator.getNewInstance();
            cal.init("John", "Peter");

            cal.increaseScoreForPlayer1();
            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer1();
            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer1();

            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer2();

            /*
             * The game is ended.
             */
            cal.increaseScoreForPlayer2();
        } finally {
            cal = null;
        }
    }

    /**
     * This is a case when the player1 win with double deuce mode.
     *
     * @since 0.0.1
     */
    protected void player1WinWithDoubleDeuceMode() {
        TennisCalculatable cal = null;
        try {
            cal = TennisCalculator.getNewInstance();
            cal.init("John", "Peter");

            cal.increaseScoreForPlayer1();
            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer1();
            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer1();

            cal.increaseScoreForPlayer1();
            cal.increaseScoreForPlayer2();


            cal.increaseScoreForPlayer1();
            cal.increaseScoreForPlayer1();

            /*
             * The game is ended.
             */
            cal.increaseScoreForPlayer1();
        } finally {
            cal = null;
        }
    }

    /**
     * This is a case when the player2 win with double deuce mode.
     *
     * @since 0.0.1
     */
    protected void player2WinWithDoubleDeuceMode() {
        TennisCalculatable cal = null;
        try {
            cal = TennisCalculator.getNewInstance();
            cal.init("John", "Peter");

            cal.increaseScoreForPlayer1();
            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer1();
            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer1();

            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer1();


            cal.increaseScoreForPlayer2();
            cal.increaseScoreForPlayer2();

            /*
             * The game is ended.
             */
            cal.increaseScoreForPlayer2();
        } finally {
            cal = null;
        }
    }

}
