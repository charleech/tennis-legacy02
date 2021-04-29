package com.summitthai.tdd.tennis.legacy;

public class TennisMain {

    public static void main(final String[] args) {
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
        } finally {
            cal = null;
        }
    }

}
