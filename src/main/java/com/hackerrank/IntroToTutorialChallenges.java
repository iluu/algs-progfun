package com.hackerrank;

import java.util.Scanner;

public class IntroToTutorialChallenges {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            if (c == val) {
                System.out.println(i);
            }
        }
    }
}
