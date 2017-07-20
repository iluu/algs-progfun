package com.hackerrank;

import java.util.Scanner;

public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int result = 0;
        String pattern = "SOS";
        for (int i = 0, j; i < S.length(); i++) {
            j = i % 3;
            if (S.charAt(i) != pattern.charAt(j)) {
                result++;
            }
        }
        System.out.println(result);
    }
}
