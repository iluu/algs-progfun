package com.hackerrank;

import java.util.Scanner;

public class TaumAndBDay {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long b = in.nextLong();
            long w = in.nextLong();
            long pB = in.nextLong();
            long pW = in.nextLong();
            long pC = in.nextLong();

            long min = 0L;
            min = min + (Math.min(pB + pC, pW)) * w;
            min = min + (Math.min(pW + pC, pB)) * b;

            System.out.println(min);
        }
    }
}
