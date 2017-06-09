package com.hackerrank;

import java.util.Scanner;

public class CountingValleys {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        System.out.println(countValleys(s));
    }

    static int countValleys(String s) {
        int result = 0;
        int currentLevel = 0;
        for (Character c : s.toCharArray()) {
            if (c == 'U') {
                currentLevel++;
                if (currentLevel == 0) {
                    result++;
                }
            } else {
                currentLevel--;
            }
        }
        return result;
    }
}
