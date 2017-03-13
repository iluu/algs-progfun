package com.hackerrank;

import java.util.Scanner;

public class CandyReplenishingRobot {

    private final static int REFILL_AT = 5;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int candies = n;
        int refilledCandies = 0;

        for (int i = 0; i < t; i++) {
            int eatenCandies = in.nextInt();
            candies = candies - eatenCandies;

            if (i < t - 1) {
                if (candies < REFILL_AT) {
                    refilledCandies += n - candies;
                    candies = n;
                }
            }

        }

        System.out.println(refilledCandies);
    }


}
