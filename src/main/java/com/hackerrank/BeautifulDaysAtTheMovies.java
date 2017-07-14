package com.hackerrank;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();

        System.out.println(countBeautiful(i, j, k));
    }

    static int countBeautiful(int i, int j, int k) {
        int result = 0;
        for (int l = i; l <= j; l++) {
            if (isBeautiful(l, k)) {
                result++;
            }
        }
        return result;
    }

    static boolean isBeautiful(int i, int k) {
        return Math.abs(i - reversed(i)) % k == 0;
    }

    static int reversed(int i) {
        String s = String.valueOf(i);
        StringBuilder result = new StringBuilder();
        for (int j = s.length() - 1; j >= 0; j--) {
            if (j != s.length() || s.charAt(j) != '0') {
                result.append(s.charAt(j));
            }
        }
        return Integer.valueOf(result.toString());
    }
}
