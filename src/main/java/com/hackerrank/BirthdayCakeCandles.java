package com.hackerrank;

import java.util.Scanner;

public class BirthdayCakeCandles {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int maxValue = 0;
        int maxCount = 0;

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            if (value > maxValue) {
                maxValue = value;
                maxCount = 1;
            } else if (value == maxValue) {
                maxCount++;
            }
        }

        System.out.println(maxCount);
    }
}
