package com.hackerrank;

import java.util.Scanner;

public class ChocolateFeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();

            System.out.println(chocolatesEaten(n, c, m));
        }
    }

    static int chocolatesEaten(int nDollars, int cPrice, int mWrappersForC) {
        int wrappers = nDollars / cPrice;
        int result = wrappers;
        while (wrappers >= mWrappersForC) {
            result += wrappers / mWrappersForC;
            wrappers = wrappers / mWrappersForC + wrappers % mWrappersForC;
        }
        return result;
    }
}
