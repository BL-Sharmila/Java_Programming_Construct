package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadderGame {
    public static final int WINNING_POSITION = 100;
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args) {
        int[] playerPositions = {0, 0};
        int currentPlayer = 0;
        int diceCount = 0;

        System.out.println("Welcome to Snake and Ladder Game");

        while (playerPositions[0] < WINNING_POSITION && playerPositions[1] < WINNING_POSITION) {
            int dieRoll = rollDie();
            diceCount++;
            int option = getOption();
            int prevPos = playerPositions[currentPlayer];

            switch (option) {
                case NO_PLAY:
                    break;
                case LADDER:
                    playerPositions[currentPlayer] += dieRoll;
                    if (playerPositions[currentPlayer] > WINNING_POSITION)
                        playerPositions[currentPlayer] = prevPos;
                    System.out.println("Player " + (currentPlayer + 1) + " gets Ladder! Moves to " + playerPositions[currentPlayer]);
                    continue; // gets another turn
                case SNAKE:
                    playerPositions[currentPlayer] -= dieRoll;
                    if (playerPositions[currentPlayer] < 0)
                        playerPositions[currentPlayer] = 0;
                    break;
            }

            System.out.println("Player " + (currentPlayer + 1) + " rolled " + dieRoll +
                    " and moved to " + playerPositions[currentPlayer]);

            // Switch player turn
            currentPlayer = (currentPlayer + 1) % 2;
        }

        System.out.println("\nPlayer " + (playerPositions[0] == WINNING_POSITION ? "1" : "2") + " wins the game!");
        System.out.println("Total Dice Rolls: " + diceCount);
    }

    public static int rollDie() {
        return new Random().nextInt(6) + 1;
    }

    public static int getOption() {
        return new Random().nextInt(3);
    }
}
