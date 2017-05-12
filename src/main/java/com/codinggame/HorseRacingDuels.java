package com.codinggame;

import java.util.Arrays;
import java.util.Scanner;

class HorseRacingDuels {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] horses = new int[n];
        for (int i = 0; i < n; i++) {
            horses[i] = in.nextInt();
        }
        Arrays.sort(horses);

        int min = Math.abs(horses[0] - horses[1]);
        for (int i = 1; i < n - 1; i++) {
            int cMin = Math.abs(horses[i] - horses[i + 1]);
            if (min > cMin) {
                min = cMin;
            }
        }
        System.out.println(min);
    }
}
