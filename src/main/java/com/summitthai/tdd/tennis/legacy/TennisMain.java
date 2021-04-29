package com.summitthai.tdd.tennis.legacy;

public class TennisMain {

    public static void main(final String[] args) {
        TennisMain main = null;
        try {
            main = new TennisMain();
            main.player1Win();
            main.player2Win();
        } finally {
            main = null;
        }
    }

    public void player1Win() {
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

    public void player2Win() {
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
        } finally {
            cal = null;
        }
    }

}
