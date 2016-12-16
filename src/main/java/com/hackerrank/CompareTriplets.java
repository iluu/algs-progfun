package com.hackerrank;

import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets
 */
public class CompareTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];

        readArray(in, a);
        readArray(in, b);

        int aRes = 0;
        int bRes = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) aRes++;
            else if (b[i] > a[i]) bRes++;
        }
        System.out.println(aRes + " " + bRes);
    }

    private static void readArray(Scanner in, int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
    }

}
