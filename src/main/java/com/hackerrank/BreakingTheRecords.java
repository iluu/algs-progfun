package com.hackerrank;

import java.util.Scanner;

public class BreakingTheRecords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxBreak = -1;
        int minBreak = -1;
        for (int i = 0; i < n; i++) {
            int score = in.nextInt();
            if (score > max) {
                maxBreak++;
                max = score;
            }

            if (score < min) {
                minBreak++;
                min = score;
            }
        }
        System.out.println(maxBreak + " " + minBreak);
    }
}
