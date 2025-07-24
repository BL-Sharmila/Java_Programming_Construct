package com.bridgelabz;

import java.util.Random;

public class GamblingSimulation {
    static final int STAKE = 100;
    static final int GOAL = 200;
    static final int NUM_DAYS = 20;

    public static void main(String[] args) {
        Random random = new Random();
        int totalWins = 0;
        int totalLosses = 0;
        int luckiestDay = 0, unluckiestDay = 0;
        int maxAmount = Integer.MIN_VALUE, minAmount = Integer.MAX_VALUE;

        for (int day = 1; day <= NUM_DAYS; day++) {
            int cash = STAKE;
            int bets = 0;

            while (cash > 0 && cash < GOAL) {
                bets++;
                if (random.nextBoolean()) {
                    cash++; // win
                } else {
                    cash--; // lose
                }
            }

            if (cash == GOAL) {
                totalWins++;
                System.out.println("Day " + day + ": Reached goal! Total amount: " + cash);
            } else {
                totalLosses++;
                System.out.println("Day " + day + ": Went broke! Total amount: " + cash);
            }

            // Track luckiest/unluckiest
            if (cash > maxAmount) {
                maxAmount = cash;
                luckiestDay = day;
            }
            if (cash < minAmount) {
                minAmount = cash;
                unluckiestDay = day;
            }
        }

        System.out.println("\nAfter " + NUM_DAYS + " days:");
        System.out.println("Total Wins: " + totalWins);
        System.out.println("Total Losses: " + totalLosses);
        System.out.println("Luckiest Day: Day " + luckiestDay);
        System.out.println("Unluckiest Day: Day " + unluckiestDay);
    }
}
