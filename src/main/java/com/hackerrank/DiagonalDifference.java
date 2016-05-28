package com.hackerrank;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int currentValue = scanner.nextInt();
                if (i == j) {
                    diagonal1 += currentValue;
                }

                if (i + j == n - 1) {
                    diagonal2 += currentValue;
                }
            }
        }
        System.out.println(Math.abs(diagonal1 - diagonal2));
    }
}
