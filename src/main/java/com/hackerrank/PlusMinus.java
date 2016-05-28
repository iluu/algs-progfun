package com.hackerrank;

import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] fractions = new float[]{0f, 0f, 0f};

        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();
            if (current > 0) {
                fractions[0]++;
            } else if (current < 0) {
                fractions[1]++;
            } else {
                fractions[2]++;
            }
        }

        System.out.println(fractions[0] / n);
        System.out.println(fractions[1] / n);
        System.out.println(fractions[2] / n);
    }
}
