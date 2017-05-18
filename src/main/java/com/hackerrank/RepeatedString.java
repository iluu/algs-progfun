package com.hackerrank;

import java.util.Scanner;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();

        System.out.println(solve(s, n));
    }

    static long solve(String s, long n) {
        long repeat = n / s.length();
        int rest = (int) (n % s.length());

        return repeat * countA(s) + countA(s.substring(0, rest));
    }

    private static int countA(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                result++;
            }
        }
        return result;
    }

}
