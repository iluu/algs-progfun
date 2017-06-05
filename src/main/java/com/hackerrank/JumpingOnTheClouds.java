package com.hackerrank;

import java.util.Scanner;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }

        System.out.println(countJumps(c));
    }

    static int countJumps(int[] arr) {
        int count = 0;
        int idx = 0;
        while (idx < arr.length - 1) {
            int nextIdx = arr.length > idx + 2 && arr[idx + 2] == 0 ? idx + 2 : idx + 1;
            count++;
            idx = nextIdx;
        }
        return count;
    }
}
