package com.hackerrank;

import java.util.Scanner;

public class MigratoryBirds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[5];
        for (int i = 0; i < n; i++) {
            int type = in.nextInt();
            types[type - 1]++;
        }

        int max = 0;
        int answer = 0;
        for (int i = 0; i < 5; i++) {
            if (types[i] > max) {
                max = types[i];
                answer = i + 1;
            }
        }
        System.out.println(answer);
    }

}
