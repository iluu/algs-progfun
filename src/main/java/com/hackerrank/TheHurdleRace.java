package com.hackerrank;

import java.util.Scanner;

public class TheHurdleRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int maxHeight = 0;
        for (int height_i = 0; height_i < n; height_i++) {
            int currentHeight = in.nextInt();
            if (currentHeight > maxHeight) {
                maxHeight = currentHeight;
            }
        }

        int result = maxHeight > k ? maxHeight - k : 0;
        System.out.println(result);
    }
}
